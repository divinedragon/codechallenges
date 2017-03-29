package hackerrank.java.datastructures;

import java.lang.reflect.Method;

public class GenericsDemo {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if ("printArray".equals(name))
                count++;
        }

        if (count > 1)
            System.out.println("Method overloading is not allowed!");

    }
}

class Printer {
    public void printArray(Object[] arr) {
        for (Object a : arr) {
            System.out.println(a);
        }
    }

}
