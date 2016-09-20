package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Day18_StacksAndQueues {

    static {
        String input = "racar";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    private LinkedList<Character> queue = new LinkedList<>();

    private Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18_StacksAndQueues p = new Day18_StacksAndQueues();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare
        // them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }

    private char dequeueCharacter() {
        return queue.removeFirst().charValue();
    }

    private char popCharacter() {
        return stack.pop().charValue();
    }

    private void enqueueCharacter(char c) {
        queue.add(new Character(c));
    }

    private void pushCharacter(char c) {
        stack.push(new Character(c));
    }
}
