package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringPallindrome {

    static {
        String input = "madam\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String strReverse = reverse(str);

        System.out.println((str.equals(strReverse)) ? "Yes" : "No");

        scan.close();
    }

    public static String reverse(String str) {

        if (str.length() == 1) {
            return str.substring(0);
        } else {
            return reverse(str.substring(1)) + str.substring(0, 1);
        }
    }
}
