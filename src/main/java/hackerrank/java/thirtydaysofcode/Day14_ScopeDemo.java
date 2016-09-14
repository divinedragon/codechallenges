package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day14_ScopeDemo {

    static {
        String input = "3\n1 2 5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;

    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

        int min = 0;
        int max = 0;

        for (int i = 0; i < elements.length; i++) {

            if (i == 0) {
                min = elements[i];
                max = elements[i];
                continue;
            }

            if (elements[i] > max) {
                max = elements[i];
            }

            if (elements[i] < min) {
                min = elements[i];
            }
        }

        this.maximumDifference = max - min;
    }
}