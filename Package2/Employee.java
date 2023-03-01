package Package2;

import java.util.Scanner;

import Package1.person;

public class Employee extends person {
    int eid,esalary;
    String ename,edesignation;
    Scanner input = new Scanner(System.in);


    public Employee(){
        eid = 0;
        esalary = 0;
        ename = "";
        edesignation = "";
    }

    void getdata(){
        getssn();
        System.out.println("Enter Employee ID: ");
        eid = input.nextInt();
        System.out.println("Enter Employee Name: ");
        ename = input.next();
        System.out.println("Enter Employee Designation: ");
        edesignation = input.next();
        System.out.println("Enter Employee Salary: ");
        esalary = input.nextInt();
    }
void displaydata(){
        displayssn();
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Designation: " + edesignation);
        System.out.println("Employee Salary: " + esalary);
    }

}

class Control{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getdata();
        e1.displaydata();
    }
}