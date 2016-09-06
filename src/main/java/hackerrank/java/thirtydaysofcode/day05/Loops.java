package hackerrank.java.thirtydaysofcode.day05;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Loops {

    static {
        String input = "2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", N, i, (N * i));
        }
    }
}
