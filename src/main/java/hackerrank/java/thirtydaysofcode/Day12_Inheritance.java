package hackerrank.java.thirtydaysofcode;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Day12_Inheritance {

    static {
        String input = "Heraldo Memelli 8135627\n2\n100 80";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class PersonInheritance {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    public PersonInheritance(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }

}

class Student extends PersonInheritance {

    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

        double average = ((double) sum) / testScores.length;
        if (90 <= average) {
            return 'O';
        } else if (80 <= average && average < 90) {
            return 'E';
        } else if (70 <= average && average < 80) {
            return 'A';
        } else if (55 <= average && average < 70) {
            return 'P';
        } else if (40 <= average && average < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }
}