package prac1;

// Create a class called “Hotel” which contains the following: 
// Private Data Members: 
// 1. Rno(Data member to store Room No) 
// 2. Name(Data member to store customer name) 
// 3. Tarrif(Data member to store per day charges) 
// 4. Days(Number of days of stay) 
// Member Function: 
// 1. Calculate( ) // A function to calculate and return the amount 
// 2. Formula: days*tarrif. 
// Public Members: 
// 1. Check-in () // A function to enter Rno, Name, tariff and days 
// 2. Display( ) // A function to display Rno, Name, Tarrif, days and 
// 3. Total amount as per the Calculate () function 
// Instantiate the class and write the main function as needed. 

import java.util.Scanner;

class Hotel {
    private int rno;
    private String name;
    private int tarrif;
    private int days;

    public Hotel(int rno, String name, int tarrif, int days) {
        this.rno = rno;
        this.name = name;
        this.tarrif = tarrif;
        this.days = days;
    }

    public int calculate() {
        return days * tarrif;
    }

    public void display() {
        System.out.println("Rno: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Tarrif: " + tarrif);
        System.out.println("Days: " + days);
        System.out.println("Total amount: " + calculate());
    }
}

public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter room number: ");
        int rno = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter tarrif: ");
        int tarrif = sc.nextInt();
        System.out.print("Enter days: ");
        int days = sc.nextInt();
        Hotel hotel = new Hotel(rno, name, tarrif, days);
        hotel.display();
    }
}