package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day23_BinarySearchTreeLevelOrderTraversal {

    static {
        String input = "6 3 5 4 7 2 1";
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
        sc.close();
        levelOrder(root);

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

    static void levelOrder(BSTNode root) {
        Queue<BSTNode> q = new LinkedList<BSTNode>();

        if (root != null) {

            q.offer(root);

            while (q.size() > 0) {

                BSTNode n = q.poll();

                System.out.print(n.data + " ");

                if (n.left != null) {
                    q.offer(n.left);
                }

                if (n.right != null) {
                    q.offer(n.right);
                }
            }
        }
    }
}