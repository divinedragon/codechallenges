package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day24_LinkedList {

    static {
        // String input = "6 1 2 2 3 3 4";
        String input = "20 3 9 9 11 11 11 11 89 89 100 100 101 102 103 108 200 250 250 250 250";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeLinkedList head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

    public static NodeLinkedList insert(NodeLinkedList head, int data) {
        NodeLinkedList p = new NodeLinkedList(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            NodeLinkedList start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(NodeLinkedList head) {
        NodeLinkedList start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static NodeLinkedList removeDuplicates(NodeLinkedList head) {

        NodeLinkedList current = head;

        while (current != null) {
            // Check the current exists anywhere in the list
            NodeLinkedList itm = current.next;
            NodeLinkedList previous = current;

            while (itm != null) {
                if (current.data == itm.data) {
                    remove(itm, previous);
                } else {
                    previous = itm;
                }
                itm = itm.next;
            }

            current = current.next;
        }

        return head;
    }

    public static void remove(NodeLinkedList node, NodeLinkedList previous) {

        if (node == null || previous == null) {
            return;
        }

        previous.next = node.next;
    }
}

class NodeLinkedList {
    int data;
    NodeLinkedList next;

    NodeLinkedList(int d) {
        data = d;
        next = null;
    }

}