package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day13_AbstractClasses {

    static {
        String input = "Harry Potter\nJ K Rowling\n500";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        int price = sc.nextInt();
        Book new_novel = new MyBook(title, author, price);
        new_novel.display();

    }
}

abstract class Book {
    protected String title;
    protected String author;

    Book(String t, String a) {
        title = t;
        author = a;
    }

    public abstract void display();
}

class MyBook extends Book {

    int price;

    public MyBook(final String title, final String author, final int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %d\n", title, author, price);
    }

}
