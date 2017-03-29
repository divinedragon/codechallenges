package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day22_BinarySearchTree {

    static {
        String input = "7 3 5 2 1 4 6 7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BSTNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

    public static BSTNode insert(BSTNode root, int data) {
        if (root == null) {
            return new BSTNode(data);
        } else {
            BSTNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static int getHeight(BSTNode root) {
        if (root == null) {
            return -1;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }
}

class BSTNode {
    public BSTNode left, right;
    public int data;

    public BSTNode(int data) {
        this.data = data;
        left = right = null;
    }
}