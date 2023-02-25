package prac1;

// Create two classes DM and DB which stores values of distances. 
// DM stores distances in meters and 
// centimeters. DB stores distances in feet and 
// inches. 
// Write a program that can read values for the class objects. Add one object of DM with 
// another object of DB. Use friend function to carry out addition’s operations. And display 
// it result in meter and centimeter. 

import java.util.Scanner;

class DM {
    private int meter;
    private int centimeter;

    public DM(int meter, int centimeter) {
        this.meter = meter;
        this.centimeter = centimeter;
    }

    public void display() {
        System.out.println("Meter: " + meter);
        System.out.println("Centimeter: " + centimeter);
    }

    public void add(DM dm) {
        this.meter += dm.meter;
        this.centimeter += dm.centimeter;
    }

    public void add(DB db) {
        this.meter += db.getMeter();
        this.centimeter += db.getCentimeter();
    }
}

class DB {
    private int feet;
    private int inch;

    public DB(int feet, int inch) {
        this.feet = feet;
        this.inch = inch;
    }

    public void display() {
        System.out.println("Feet: " + feet);
        System.out.println("Inch: " + inch);
    }

    public int getMeter() {
        return (int) (feet * 0.3048);
    }

    public int getCentimeter() {
        return (int) (inch * 2.54);
    }
}

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter meter and centimeter for DM: ");
        int meter = sc.nextInt();
        int centimeter = sc.nextInt();
        DM dm = new DM(meter, centimeter);
        System.out.println("Enter feet and inch for DB: ");
        int feet = sc.nextInt();
        int inch = sc.nextInt();
        DB db = new DB(feet, inch);
        dm.add(db);
        dm.display();
        sc.close();
    }
}