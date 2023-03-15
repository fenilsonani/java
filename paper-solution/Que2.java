//  Name Formate : FirstName MiddleName SurName
//  surname is Modi incentivise is 10%
//  name starts is Ram incentivise is 15%
//  father name includes indra give increment 7%
// name container i at index 7 give increament 5%

import java.util.Scanner;

class Employee
{
    int eno;
    String empName,department,designation;
    double incentive;
    double salary;
    Scanner sc=new Scanner(System.in);
    void getData()
    {
        System.out.println("Enter eno: ");
        eno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter department: ");
        department=sc.nextLine();
        System.out.println("Enter empName: ");
        empName=sc.nextLine();
        System.out.println("Enter designation: ");
        designation=sc.nextLine();
        System.out.println("Enter salary: ");
        salary=sc.nextDouble();
    }
    void displayData()
    {
        System.out.println("department: " + department);
        System.out.println("eno: " + eno);
        System.out.println("empName: " + empName);
        System.out.println("designation: " + designation);
        System.out.println("salary: " + salary);
    }
    
    //calculate incentive
    void incentivise()
    {
        if(empName.endsWith("Modi")){
            incentive=salary*0.15;
            System.out.println("incentive: " + incentive);
        }
        else if(empName.startsWith("Ram")){
            incentive=salary*0.1;
            System.out.println("incentive: " + incentive);
        }
        else if(empName.contains("indra")){
            incentive=salary*0.07;
            System.out.println("incentive: " + incentive);
        }
        else if(empName.indexOf('i')==7){
            incentive=salary*0.05;
            System.out.println("incentive: " + incentive);
        }
        else{
            incentive=0;
            System.out.println("You are not eligible for incentive");
        }
    }
}

public class solution {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.getData();
        e.displayData();
        e.incentivise();
    }
}
