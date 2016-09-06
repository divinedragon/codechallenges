package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDuplicateWords {

    static {
        String input = "5\nGoodbye bye bye world world world\nSwapnil went went to to to his business\nRana is is the the best player in eye eye game\nin inthe\nHello hello Ab aB";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE + Pattern.MULTILINE);

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while (testCases > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);

            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            System.out.println(input);
            testCases--;
        }

        in.close();
    }
}
