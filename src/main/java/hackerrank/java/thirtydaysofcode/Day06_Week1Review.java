package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day06_Week1Review {

    static {
        String input = "2\nHacker\nRank\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < T; i++) {

            String str = scan.nextLine();
            int strLength = str.length();

            String evenChars = "";
            String oddChars = "";

            for (int c = 0; c < strLength; c++) {
                if (c % 2 == 0) {
                    evenChars += str.charAt(c) + "";
                } else {
                    oddChars += str.charAt(c) + "";
                }
            }

            System.out.printf("%s %s\n", evenChars, oddChars);
        }

        scan.close();
    }
}
