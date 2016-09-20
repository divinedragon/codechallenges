package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day19_InterfacesDemo {
    static {
        String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new CalculatorAdvanced();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class CalculatorAdvanced implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}