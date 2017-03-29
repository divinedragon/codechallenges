package hackerrank.java.oops;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InstanceOfDemo {

    static {
        String input = "5\nStudent\nStudent\nRockstar\nStudent\nHacker";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static String count(ArrayList<Object> mylist) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<Object>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if ("Student".equals(s))
                mylist.add(new Student());
            if ("Rockstar".equals(s))
                mylist.add(new Rockstar());
            if ("Hacker".equals(s))
                mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
        sc.close();
    }
}

class Student {
}

class Rockstar {
}

class Hacker {
}