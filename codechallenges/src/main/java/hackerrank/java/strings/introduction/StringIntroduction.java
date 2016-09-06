package hackerrank.java.strings.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StringIntroduction {

    static {
        String input = "hello\nworld";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.printf("%s%s %s%s\n", A.substring(0, 1).toUpperCase(), A.substring(1),
                B.substring(0, 1).toUpperCase(), B.substring(1));

        sc.close();
    }

}
