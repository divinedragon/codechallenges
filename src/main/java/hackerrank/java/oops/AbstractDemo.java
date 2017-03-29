package hackerrank.java.oops;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AbstractDemo {

    static {
        String input = "A tale of two cities";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        // Book new_novel=new Book(); This line prHMain.java:25: error: Book is
        // abstract; cannot be instantiated
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }
}

abstract class Book {
    protected String title;

    public abstract void setTitle(String s);

    public String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    public void setTitle(String s) {
        this.title = s;
    }
}
