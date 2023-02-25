package prac1;

// Write a menu driven program that manages the functionalities of Library. Give choice to 
// the user, to perform from following operation:  
// 1.  Member Detail 
// 2.  Book Detail 
// 3.  Exit 
//  Member Detail – Manages stuff related to members. 
//  Book Detail – Manages stuff related to books. 
//  Exit – to close application

import java.util.Scanner;

class class1{
    private int id;
    private String name;
    private int semester;
    private int[] marks = new int[5];

    public class1(int id, String name, int semester, int[] marks) {
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

public class Que5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class1[] students = new class1[5];
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
            students[i] = new class1(id, name, semester, marks);
        }
        for (int i = 0; i < 5; i++) {
            students[i].display();
            students[i].calculatePercentage();
        }
    }
}