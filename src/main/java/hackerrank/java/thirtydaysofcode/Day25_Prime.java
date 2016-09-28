package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day25_Prime {

    static {
        String input = "3 12 5 7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        while (T-- > 0) {

            long N = scan.nextLong();
            System.out.println(isPrime(N) ? "Prime" : "Not prime");
        }

        scan.close();
    }

    public static boolean isPrime(long N) {
        if (N <= 1) {
            return false;
        }

        if (N == 2 || N == 3) {
            return true;
        }

        if (N % 2 == 0) {
            return false;
        }

        for (long i = 3; i <= Math.sqrt(N); i += 2) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }
}
