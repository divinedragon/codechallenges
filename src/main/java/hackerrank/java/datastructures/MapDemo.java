package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

    static {
        String input = "3\nuncle sam\n99912222\ntom\n11122222\nharry\n12299933\nuncle sam\nuncle tom\nharry";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.nextLine();

            if (phoneBook.containsKey(s)) {
                System.out.printf("%s=%s\n", s, phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }

        in.close();
    }
}
