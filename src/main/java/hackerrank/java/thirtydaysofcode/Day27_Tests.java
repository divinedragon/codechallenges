package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Day27_Tests {

    private static ByteArrayOutputStream OUT;
    static {
        OUT = new ByteArrayOutputStream();
        System.setOut(new PrintStream(OUT));
    }

    public static void main(String[] args) {

        System.out.println("5");
        System.out.println("4 3");
        System.out.println("-1 -3 4 2");
        System.out.println("5 2");
        System.out.println("0 -1 2 1 4");
        System.out.println("3 1");
        System.out.println("-1 -2 -3");
        System.out.println("10 10");
        System.out.println("0 0 0 0 0 0 0 0 0 0");
        System.out.println("10 1");
        System.out.println("0 0 0 0 0 0 0 0 0 0");
        System.out.println("3 3");
        System.out.println("0 -3 4");
        System.out.println("7 2");
        System.out.println("0 -3 1 1 1 1 1");
        System.out.println("6 3");
        System.out.println("0 -3 4 2 1 1");
        professorSolution();
    }

    public static void professorSolution() {

        Scanner scan = new Scanner(new ByteArrayInputStream(OUT.toByteArray()));
        int T = scan.nextInt();

        while (T-- > 0) {
            int N = scan.nextInt();
            int k = scan.nextInt();

            boolean isCancelled = true;
            while (N-- > 0) {
                int a = scan.nextInt();
                if (a >= 0) {
                    k--;
                }

                if (k == 0) {
                    isCancelled = false;
                    break;
                }
            }

            System.err.println((isCancelled) ? "YES" : "NO");
        }

        scan.close();
    }

}
