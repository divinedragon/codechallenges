package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringCompare {

    static {
        String input = "welcometojava\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int wordLength = scan.nextInt();

        String max = "";
        String min = "";

        for (int c = 0; (c + wordLength) <= string.length(); c++) {

            String word;

            if (c + wordLength >= string.length()) {
                word = string.substring(c);
            } else {
                word = string.substring(c, c + wordLength);
            }

            // System.out.println(word);

            if ("".equals(max)) {
                max = word;
            }

            if ("".equals(min)) {
                min = word;
            }

            if (min.compareTo(word) > 0) {
                min = word;
            }

            if (max.compareTo(word) < 0) {
                max = word;
            }
        }

        System.out.printf("%s\n%s", min, max);

        scan.close();

    }
}
