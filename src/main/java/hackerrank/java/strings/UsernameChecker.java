package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameChecker {

    static {
        String input = "5\nalpha_naheed\nxahidbuffon\nnagib@007\n123Swakkhar\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String username = in.nextLine();

            String pattern = "^[A-Za-z][0-9A-Za-z_]{7,29}$";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
