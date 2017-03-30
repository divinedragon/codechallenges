package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    static {
        String input = "3\n([A-Z])(.+)\n[AZ[a-z](a-z)\nbatcatpat(nat\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            testCases--;
        }

        in.close();
    }
}
