package hackerrank.java.introduction;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class StaticBlockInitializer {

    public static int B;
    public static int H;
    public static boolean flag = true;

    static {
        String input = "1\n3";
        // String input = "-1\n2";
        Scanner scan = new Scanner(new ByteArrayInputStream(input.getBytes()));

        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }

        scan.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
