package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day20_BubbleSort {

    static {
        String input = "3\n3 2 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }

        // Track number of elements swapped during a single array traversal
        int numberOfSwaps = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    numberOfSwaps++;
                }
            }

            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }

        System.out.printf("Array is sorted in %d swaps.\n", numberOfSwaps);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[N - 1]);
    }
}
