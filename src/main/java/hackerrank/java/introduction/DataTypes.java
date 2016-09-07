package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DataTypes {

    static {
        String input = "5\n-150\n150000\n1500000000\n213333333333333333333333333333333333\n-100000000000000";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483648 && x <= 2147483647)
                    System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
