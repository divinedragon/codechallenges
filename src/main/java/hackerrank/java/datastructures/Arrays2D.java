package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Arrays2D {

    static {
        String input = "1 1 1 0 0 0\n0 1 0 0 0 0\n1 1 1 0 0 0\n0 0 2 4 4 0\n0 0 0 2 0 0\n0 0 1 2 4 0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        in.close();

        int sum = -1000;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {

                int currentHourGlassSum =
                        // @formatter:off
                        arr[i][j]   + arr[i][j+1]   + arr[i][j+2]
                                    + arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]
                        ;
                        // @formatter:on

                if (currentHourGlassSum > sum) {
                    sum = currentHourGlassSum;
                }
            }
        }

        System.out.println(sum);
    }
}
