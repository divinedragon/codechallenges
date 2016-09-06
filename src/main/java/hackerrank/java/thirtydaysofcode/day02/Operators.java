package hackerrank.java.thirtydaysofcode.day02;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Operators {

    static {
        String input = "12.00\n20\n8";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double totalCostOriginal = mealCost + (mealCost * tipPercent * 0.01) + (mealCost * taxPercent * 0.01);

        // cast the result of the rounding operation to an int and save it as
        // totalCost
        int totalCost = (int) Math.round(totalCostOriginal);

        // Print your result
        System.out.printf("The total meal cost is %d dollar%s.\n", totalCost, (totalCost > 1) ? "s" : "");
    }
}
