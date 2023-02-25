package prac1;

//  Write a program that define class student, in which put fields like student 
// id,name,semester and marks of minimum 5 subjects, and perform following operations: 
// 1. Insert values for five students through function. (Create 5 objects) 
// 2. Calculate percentage and grade, if student is fail in any subject then grade is F and 
// if he/she is pass then criteria for grade is as follows: 
// a. if per >=70 grade is A 
// b. if per >=60 and <70 then grade is B 
// c. if per >=50 and <60 then grade is C 
// d. Otherwise D. 
// 3. Display student result in mark sheet like format.


import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int semester;
    private int[] marks = new int[5];

    public Student(int id, String name, int semester, int[] marks) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Semester: " + semester);
        System.out.println("Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }
    }

    public void calculatePercentage() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += marks[i];
        }
        double percentage = (double) total / 5;
        System.out.println("Percentage: " + percentage);
        if (percentage >= 70) {
            System.out.println("Grade: A");
        } else if (percentage >= 60) {
            System.out.println("Grade: B");
        } else if (percentage >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }
    }
}

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter semester: ");
            int semester = sc.nextInt();
            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }
            students[i] = new Student(id, name, semester, marks);
        }
        for (int i = 0; i < 5; i++) {
            students[i].display();
            students[i].calculatePercentage();
        }
    }
}