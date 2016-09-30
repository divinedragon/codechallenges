package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day29_BitwiseOperator {

    static {
        // @formatter:off
        String input = "3"
                + " 5 2"
                + " 8 5"
                + " 2 2";
        // @formatter:on
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        FilterLogic predicate = (A, B, currentMax, maxValueLimit) -> {

            int andValue = A & B;

            if (andValue > currentMax && andValue < maxValueLimit) {
                return true;
            }

            return false;
        };

        while (T-- > 0) {

            int N = scan.nextInt();
            int K = scan.nextInt();

            int max = 0;

            for (int i = 1; i < N - 1; i++) {
                for (int j = i + 1; j <= N; j++) {
                    if (predicate.isMaxWithInLimits(i, j, max, K)) {
                        max = i & j;
                    }

                }
            }

            System.out.println(max);
        }

        scan.close();
    }
}

interface FilterLogic {
    boolean isMaxWithInLimits(int A, int B, int currentMax, int maxValueLimit);
}
