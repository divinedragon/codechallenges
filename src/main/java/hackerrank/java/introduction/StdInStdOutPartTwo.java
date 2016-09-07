package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StdInStdOutPartTwo {

    static {
        String input = "42\n3.1415\nWelcome to HackerRank's Java tutorials!";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
