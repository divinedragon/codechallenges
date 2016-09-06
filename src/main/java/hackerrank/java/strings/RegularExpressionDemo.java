package hackerrank.java.strings;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class RegularExpressionDemo {

    static {
        String input = "000.12.12.034\n121.234.12.12\n23.45.12.56\n00.12.123.123123.123\n122.23\nHello.IP";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }

        in.close();
    }
}

class myRegex {
    String ipRange = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = ipRange + "." + ipRange + "." + ipRange + "." + ipRange;
}
