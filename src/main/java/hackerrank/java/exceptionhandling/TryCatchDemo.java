package hackerrank.java.exceptionhandling;

import java.io.ByteArrayInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchDemo {

    static {
        // String input = "10\n3";
        // String input = "10\n0";
        String input = "2147483648\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        try {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();

            System.out.println(n1 / n2);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        scan.close();
    }
}
