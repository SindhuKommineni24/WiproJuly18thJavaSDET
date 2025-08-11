/*College Admission System
Abstract class Student:
Fields: name, rollNo
Abstract method: getGrade()
Subclasses:
EngineeringStudent
MedicalStudent
Each implements getGrade() based on marks.*/

package labsession3;
abstract class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    abstract void getGrade();
}

class EngineeringStudent extends Student {
    int marks;
    EngineeringStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void getGrade() {
        System.out.println("Engineering Student " + name + " (Roll No: " + rollNo + ")");
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
        System.out.println();
    }
}

class MedicalStudent extends Student {
    int marks;

    MedicalStudent(String name, int rollNo, int marks) {
        super(name, rollNo);
        this.marks = marks;
    }

    void getGrade() {
        System.out.println("Medical Student " + name + " (Roll No: " + rollNo + ")");
        if (marks >= 85)
            System.out.println("Grade: A");
        else if (marks >= 70)
            System.out.println("Grade: B");
        else if (marks >= 55)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
        System.out.println();
    }
}

public class Abstraction6 {
    public static void main(String[] args) {
        EngineeringStudent eng = new EngineeringStudent("Sindhu", 101, 88);
        MedicalStudent med = new MedicalStudent("Akhil", 102, 67);
        eng.getGrade();
        med.getGrade();
    }
}
