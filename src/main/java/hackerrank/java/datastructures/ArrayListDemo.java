package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

    static {
        String input = "5\n5 41 77 74 22 44\n1 12\n4 37 34 36 52\n0\n3 20 22 33";
        String inputQueries = input + "\n" + "5\n1 3\n3 4\n3 1\n4 3\n5 5";
        System.setIn(new ByteArrayInputStream(inputQueries.getBytes()));
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<List<Integer>> rows = new ArrayList<>(N);

        for (int i = 0; i < N; i++) {
            List<Integer> rowData = new ArrayList<>();
            int rowItemCount = scan.nextInt();

            for (int j = 0; j < rowItemCount; j++) {
                rowData.add(scan.nextInt());
            }

            rows.add(rowData);
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            int rowIndex = scan.nextInt() - 1;
            int itemIndex = scan.nextInt() - 1;

            if (rowIndex >= rows.size() || itemIndex >= rows.get(rowIndex).size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(rows.get(rowIndex).get(itemIndex));
            }
        }

        scan.close();
    }
}
