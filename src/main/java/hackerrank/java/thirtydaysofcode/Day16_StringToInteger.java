package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day16_StringToInteger {

    static {
        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            int i = Integer.parseInt(S, 10);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
