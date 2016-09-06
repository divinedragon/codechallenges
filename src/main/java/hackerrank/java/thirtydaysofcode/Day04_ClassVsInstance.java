package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day04_ClassVsInstance {

    static {
        String input = "4\n-1\n10\n16\n18";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}

class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            age = 0;
        }

        age = initialAge;
    }

    public void amIOld() {
        String ans = "";

        if (age < 13) {
            ans = "You are young.";
        } else if (13 <= age && age < 18) {
            ans = "You are a teenager.";
        } else {
            ans = "You are old.";
        }

        System.out.println(ans);
    }

    public void yearPasses() {
        age++;
    }
}