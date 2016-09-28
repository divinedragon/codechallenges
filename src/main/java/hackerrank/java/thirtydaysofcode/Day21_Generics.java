package hackerrank.java.thirtydaysofcode;

public class Day21_Generics {

    private static void printArray(Object[] a) {
        for (Object o : a) {
            System.out.println(o.toString());
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray(intArray);
        printArray(stringArray);

        if (Day21_Generics.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
