package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28_RegExpPatterns {

    static {
        // @formatter:off
        String input = ""
                + "6\n"
                + "riya riya@gmail.com\n"
                + "julia julia@julia.me\n"
                + "julia sjulia@gmail.com\n"
                + "julia julia@gmail.com\n"
                + "samantha samantha@gmail.com\n"
                + "tanya tanya@gmail.com\n";
        // @formatter:on
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = Integer.parseInt(scan.nextLine().replaceAll("\n", ""));

        List<String> filteredNames = new ArrayList<>();

        Pattern pattern = Pattern.compile("@gmail.com");

        while (T-- > 0) {
            String entry = scan.nextLine();
            String name = entry.split(" ")[0];
            String email = entry.split(" ")[1];

            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) {
                filteredNames.add(name);
            }
        }

        Collections.sort(filteredNames);

        for (String name : filteredNames) {
            System.out.println(name);
        }

        scan.close();
    }
}
