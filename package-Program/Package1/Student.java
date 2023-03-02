package Package1;


import java.util.Scanner;

import Package1.subPack.Sports;

public class Student implements Sports {
    int id;
    int[] marks = new int[5];
    int sportsMarks;
    String name,course;
    Scanner input = new Scanner(System.in);
    public Student(){
        id = 0;
        name = "";
        course = "";
        for(int i=0;i<5;i++){
            marks[i] = 0;
        }
        sportsMarks = 0;
    }
    public void getStudentData(){
        System.out.println("Enter Student ID: ");
        id = input.nextInt();
        System.out.println("Enter Student Name: ");
        name = input.next();
        System.out.println("Enter Student Course: ");
        course = input.next();
        System.out.println("Enter Student Marks: ");
        for(int i=0;i<5;i++){
            marks[i] = input.nextInt();
        }
    }
    public void displayStudentData(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
        System.out.println("Student Marks: ");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }
    }

    public void getSportsMarks() {
        System.out.println("Enter Sports Marks: ");
        sportsMarks = input.nextInt();
    }

    public void displaySportsMarks() {
        System.out.println("Sports Marks: " + sportsMarks);
    }
    
}
