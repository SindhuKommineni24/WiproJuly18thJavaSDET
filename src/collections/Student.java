package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    
    int rollNumber;
    String name;

    // Constructor
    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Implement compareTo for natural ordering by rollNumber
    @Override
    public int compareTo(Student s) {
        return this.rollNumber - s.rollNumber;
    }

    // Override toString for readable output
    @Override
    public String toString() {
        return "Student{rollNumber=" + rollNumber + ", name='" + name + "'}";
    }

    // Main method
    public static void main(String[] args) {
        List<Student> stu = new ArrayList<>();
        stu.add(new Student(103, "Ravi"));
        stu.add(new Student(101, "Amit"));
        stu.add(new Student(102, "Zara"));

        Collections.sort(stu); // sort by rollNumber (ascending)

        for (Student s : stu) {
            System.out.println(s);
        }
    }
}
