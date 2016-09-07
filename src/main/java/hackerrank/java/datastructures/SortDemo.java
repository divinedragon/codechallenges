package hackerrank.java.datastructures;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortDemo {

    static {
        String input = "5\n33 Rumpa 3.68\n85 Ashis 3.85\n56 Samiha 3.75\n19 Samara 3.75\n22 Fahim 3.76";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

class Student implements Comparable {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object obj) {

        Student o = (Student) obj;

        if (o.cgpa > this.cgpa) {
            return 1;
        } else if (o.cgpa < this.cgpa) {
            return -1;
        } else if (o.fname.compareTo(this.fname) > 0) {
            return -1;
        } else if (o.fname.compareTo(this.fname) < 0) {
            return 1;
        } else if (o.id > this.id) {
            return -1;
        } else if (o.id < this.id) {
            return 1;
        } else {
            return 0;
        }
    }
}