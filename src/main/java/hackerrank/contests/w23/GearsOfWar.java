package hackerrank.contests.w23;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class GearsOfWar {

    static {
        String input = "2\n3\n4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Q = scan.nextInt();

        for (int i = 0; i < Q; i++) {
            int N = scan.nextInt();
            System.out.println((N % 2 == 0) ? "Yes" : "No");
        }
        scan.close();
    }
}
