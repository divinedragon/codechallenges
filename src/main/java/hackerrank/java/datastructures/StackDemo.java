package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class StackDemo {

    static {
        String input = "{}()\n({()})\n{}(\n[]\n({}[])\n(({()})))\n({(){}()})()({(){}()})(){()}\n{}()))(()()({}}{}\n}}}}\n))))\n{{{\n(((\n[]{}(){()}((())){{{}}}{()()}{{}{}}\n[[]][][]";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            LinkedList<String> l = new LinkedList<>();
            boolean isBreak = false;
            for (int i = 0; i < input.length(); i++) {

                char c = input.charAt(i);
                if (c == '{' || c == '(' || c == '[') {
                    l.push(c + "");
                } else if (c == '}' || c == ')' || c == ']') {

                    if (l.size() == 0) {
                        isBreak = true;
                        break;
                    }

                    char s = l.pop().charAt(0);
                    if ((c == '{' && s != '}') || (c == '(' && s != ')') || (c == '[' && s != ']')) {
                        isBreak = true;
                        break;
                    }

                } else {
                    continue;
                }
            }

            System.out.println((l.size() == 0 && !isBreak));
        }

        sc.close();
    }
}
