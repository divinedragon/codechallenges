package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day15_LinkedList {

    static {
        String input = "4 2 3 4 1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

    public static Node insert(Node head, int data) {
        Node start = head;

        if (start != null) {
            while (start.next != null) {
                start = start.next;
            }

            start.next = new Node(data);
        } else {
            head = new Node(data);
        }

        return head;
    }
}

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
