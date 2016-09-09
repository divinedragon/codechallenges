package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day09_RecursionFactorial {

    static {
        String input = "12";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        System.out.println(factorial(N));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
