package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day26_NestedLogic {

    static {
        // @formatter:off
        String input = ""
                + "9 6 2015\n"
                + "6 6 2015";
        // @formatter:on
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String returnDate = scan.nextLine();
        String expectedDate = scan.nextLine();

        scan.close();

        int returnDay = Integer.parseInt(returnDate.split(" ")[0]);
        int returnMonth = Integer.parseInt(returnDate.split(" ")[1]);
        int returnYear = Integer.parseInt(returnDate.split(" ")[2]);

        int expectedDay = Integer.parseInt(expectedDate.split(" ")[0]);
        int expectedMonth = Integer.parseInt(expectedDate.split(" ")[1]);
        int expectedYear = Integer.parseInt(expectedDate.split(" ")[2]);

        if (expectedYear < returnYear) {
            System.out.println(10000);
        } else if (expectedYear == returnYear) {
            if (expectedMonth < returnMonth) {
                System.out.println((returnMonth - expectedMonth) * 500);
            } else if (expectedMonth == returnMonth) {
                if (expectedDay < returnDay) {
                    System.out.println((returnDay - expectedDay) * 15);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
