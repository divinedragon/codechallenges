package hackerrank.java.advanced;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class CheckPrimeVarargs {

    static {
        String input = "2\n1\n3\n4\n5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Prime {

    public void checkPrime(int... numbers) {

        String output = "";

        for (int n : numbers) {

            if (n == 1) {
                continue;
            }

            if (n == 2 || n == 3) {
                output += n + " ";
                continue;
            }

            boolean isPrime = true;

            for (int i = 3; i < n; i += 2) {

                if (n % i == 0 || n % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                output += n + " ";
            }
        }

        System.out.println(output.trim());
    }
}
