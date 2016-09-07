package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class EndOfFile {

    static {
        String input = "Hello world\nI am a file\nRead me until end-of-file.";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
    public static final String EOF = "end-of-file.";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lineNo = 1;

        String output = "";

        while (scan.hasNext()) {

            String s = scan.nextLine();

            output += lineNo + " " + s + "\n";
            lineNo++;
            if (s.contains(EOF)) {
                break;
            }
        }

        if (output.contains(EOF)) {
            System.out.println(output.substring(0, output.indexOf(EOF)) + EOF);
        } else {
            System.out.println(output);
        }

        scan.close();
    }
}
