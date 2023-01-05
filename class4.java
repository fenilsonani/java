// Create two classes DM and DB which stores values of distances.
// DM stores distances in meters and
// centimeters. DB stores distances in feet and
// inches.
// Write a program that can read values for the class objects. Add one object of DM with
// another object of DB. Use friend function to carry out addition’s operations. And display
// it result in meter and centimeter.

package pkg1;

import java.util.Scanner;

class DM{
    int meter,centimeter;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Meter");
        meter=sc.nextInt();
        System.out.println("Enter Centimeter");
        centimeter=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("Meter is a :"+meter);
        System.out.println("Centimeter is a :"+centimeter);
    }
    void add(DM d1,DB d2){
        meter=(int) (d1.meter+d2.feet*0.3048);
        centimeter=(int) (d1.centimeter+d2.inches*2.54);
    }
}

class DB{
    int feet,inches;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Feet");
        feet=sc.nextInt();
        System.out.println("Enter Inches");
        inches=sc.nextInt();
        sc.close();
    }
    void display(){
        System.out.println("Feet is a :"+feet);
        System.out.println("Inches is a :"+inches);
    }
}

public class class4 {
    public static void main(String[] args) {
        DM d1=new DM();
        DB d2=new DB();
        d1.getdata();
        d2.getdata();
        d1.add(d1, d2);
        d1.display();
    }
}
