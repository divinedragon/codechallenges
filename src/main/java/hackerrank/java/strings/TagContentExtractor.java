package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    static {
        String input = "4\n<h1>Nayeem loves counseling</h1>\n<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>\n<Amee>safat codes like a ninja</amee>\n<SA premium>Imtiaz has a secret crash</SA premium>";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            int count = 0;
            Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                if (m.group(2).length() != 0) {
                    System.out.println(m.group(2));
                    count++;
                }
            }
            if (count == 0)
                System.out.println("None");

            testCases--;
        }

        in.close();
    }
}
