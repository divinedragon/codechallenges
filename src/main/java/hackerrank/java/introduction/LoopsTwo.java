package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class LoopsTwo {

    static {
        String input = "2\n0 2 10\n5 3 5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int s = a + b;
            System.out.print(s + " ");
            for (int itr = 1; itr < n; itr++) {
                s = s + ((int) Math.pow(2, itr) * b);
                System.out.print(s + " ");
            }

            System.out.println();

        }
        in.close();
    }
}
