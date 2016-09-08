package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class SubArrays {

    static {
        String input = "5\n1 -2 4 -5 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        scan.close();

        int count = 0;

        for (int i = 0; i < N; i++) {

            int sum = 0;
            for (int j = i; j < N; j++) {
                sum += A[j];

                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
