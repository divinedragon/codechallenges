package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class OutputFormatting {

    static {
        String input = "java 100\ncpp 65\npython 50";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

        sc.close();
    }
}
