package hackerrank.java.thirtydaysofcode.day01;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class DataTypes {

    static {
        String input = "12\n4.0\nis the best place to learn and practice coding!";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    public static void main(String[] args) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int intnum = scan.nextInt();
        double dblnum = scan.nextDouble();
        scan.nextLine();
        String strLine = scan.nextLine();

        System.out.println(i + intnum);
        System.out.println(d + dblnum);
        System.out.println(s + strLine);

        scan.close();
    }
}
