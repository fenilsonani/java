package pkg1;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks[];
    int total;
    double avg;
    Scanner sc = new Scanner(System.in);

    Student() {
        id = 0;
        name = "";
        marks = new int[3];
        total = 0;
        avg = 0;
    }

    void getdata() {
        System.out.println("Enter Id");
        id = sc.nextInt();
        System.out.println("Enter Name");
        name = sc.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter The Marks " + (i + 1) + " Subject");
            marks[i] = sc.nextInt();
        }
    }

    void displaydata() {
        System.out.println("Id is:" + id);
        System.out.println("Name is a:" + name);
        for (int i = 0; i < 3; i++) {
            System.out.println("Your " + (i + 1) + " Subject Mark Is a:" + marks[i]);
            total += marks[i];
        }
        System.out.println("Your Total Marks Is a :" + total);
        avg = total / 3;
        avg = (int) avg;
        System.out.println("Your Average Is a " + avg);
    }
}

public class student {

    public static void main(String[] args) {
        Student s = new Student();
        s.getdata();
        s.displaydata();
    }

}