//         ---student---
//         |            |
//         |            |
// internal exam    External exam
//         |            |
//         |            |
//         ---result---

// write a to implement given relationship by defining classes and interfaces.Student will have readData() and displayData().internalExam Will have internalmarks().external exam will have externalexamMarks().use result class to generate result of student.

import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        name = sc.nextLine();
        System.out.println("Enter Roll No");
        rollNo = sc.nextInt();
        System.out.println("Enter Marks");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

interface internalExam {
    public void internalMarks();
}

interface externalExam {
    public void externalMarks();
}

class Result extends Student implements internalExam, externalExam {
    public void internalMarks() {
        System.out.println("Internal Marks: " + (marks * 0.4));
    }

    public void externalMarks() {
        System.out.println("External Marks: " + (marks * 0.6));
    }
    public void displayData() {
        super.displayData();
        internalMarks();
        externalMarks();
    }
    public static void main(String[] args) {
        Result obj = new Result();
        obj.readData();
        obj.displayData();
    }
}