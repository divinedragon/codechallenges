package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInsertDeleteDemo {

    static {
        String input = "5\n12 0 1 78 12\n2\nInsert\n5 23\nDelete\n0";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }

        int Q = scan.nextInt();

        for (int i = 0; i < Q; i++) {
            scan.nextLine();
            String instruction = scan.nextLine();
            if ("Insert".equals(instruction)) {
                int index = scan.nextInt();
                int value = scan.nextInt();

                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }

        scan.close();

        String output = "";
        for (int n : list) {
            output += n + " ";
        }

        System.out.println(output.trim());
    }
}
