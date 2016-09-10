package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day10_BinaryNumbers {

    static {
        String input = "13";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String output = "";
        while (n > 0) {
            output = (n % 2) + output;
            n = n / 2;
        }

        int maxOnes = -1;

        String[] splits = output.split("0");
        for (String split : splits) {
            int currentLength = split.replaceAll("0", "").length();
            if (currentLength > maxOnes) {
                maxOnes = currentLength;
            }
        }

        System.out.println(maxOnes);
    }
}
