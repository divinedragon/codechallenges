package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day17_MoreExceptions {

    static {
        String input = "4 3 5 2 4 -1 -2 -1 3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T-- > 0) {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

class Calculator {

    public int power(int n, int p) {
        if (n < 0 || p < 0) {
            throw new IllegalArgumentException("n and p should be non-negative");
        }
        return (int) Math.pow((double) n, (double) p);
    }

}
