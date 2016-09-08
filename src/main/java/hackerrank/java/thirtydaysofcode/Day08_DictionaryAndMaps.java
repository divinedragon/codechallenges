package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionaryAndMaps {

    static {
        String input = "3\nsam 99912222\ntom 11122222\nharry 12299933\nsam\nedward\nharry";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, String> phoneBook = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone + "");
        }
        while (in.hasNext()) {
            String s = in.next();

            String phoneNo = phoneBook.get(s);

            if (phoneNo != null && !phoneNo.isEmpty()) {
                System.out.printf("%s=%s\n", s, phoneNo);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
