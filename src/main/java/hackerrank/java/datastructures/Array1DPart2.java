package hackerrank.java.datastructures;

import java.util.Scanner;

public class Array1DPart2 {

    /*
    static {
        String input =
        // @formatter:off
          "9\n"
        + "5 3\n"
        + "0 0 0 0 0\n"                 // YES
        + "6 5\n"
        + "0 0 0 1 1 1\n"               // YES
        + "6 3\n"
        + "0 0 1 1 1 0\n"               // NO
        + "3 1\n"
        + "0 1 0\n"                     // NO
        + "10 6\n"
        + "0 0 1 1 0 0 1 1 0 0\n"       // NO
        + "6 2\n"                   
        + "0 1 0 1 0 1\n"               // YES
        + "4 0\n"
        + "0 0 0 0\n"                   // YES
        + "44 15\n"
        + "0 0 1 1 1 0 1 0 0 1 1 0 1 1 0 0 1 0 1 0 0 0 1 0 0 0 1 0 1 0 1 1 1 1 0 1 0 1 1 1 1 1 1 1\n" //YES
        ;
        // @formatter:on

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    */

    static {
        System.setIn(Array1DPart2.class.getResourceAsStream("arrays1d-part2-input.txt"));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int n = scan.nextInt();
            int m = scan.nextInt();

            int[] A = new int[n];
            for (int k = 0; k < n; k++) {
                A[k] = scan.nextInt();
            }

            System.out.println((isSolvable(m, A, 0)) ? "YES" : "NO");
        }

        scan.close();
    }

    private static boolean isSolvable(int m, int[] A, int i) {
        if (i < 0 || A[i] == 1) {
            return false;
        }

        if ((i == A.length - 1) || i + m > A.length - 1) {
            return true;
        }

        A[i] = 1;

        return isSolvable(m, A, i + 1) || isSolvable(m, A, i - 1) || isSolvable(m, A, i + m);
    }
}
