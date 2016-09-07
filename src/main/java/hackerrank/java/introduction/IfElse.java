package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class IfElse {

    static {
        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {

            if (2 <= n && n <= 5) {
                ans = "Not Weird";
            } else if (6 <= n && n <= 20) {
                ans = "Weird";
            } else {
                ans = "Not Weird";
            }

        }
        System.out.println(ans);

        sc.close();
    }
}
