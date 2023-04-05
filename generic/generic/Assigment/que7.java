package generic.Assigment;

// write a program illustate the use of array deque and priority queue class for stroing and retriving employee records.

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

class Employe
{
    String name;
    int id;
    int salary;
    Employe(){
        name="";
        id=0;
        salary=0;
    }
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Id");
        id=sc.nextInt();
        System.out.println("Enter Salary");
        salary=sc.nextInt();
    }
    void displayData(){
        System.out.println("Name: "+name +"\tId: "+id+"\tSalary: "+salary);
    }
}
class que7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employes");
        int n=sc.nextInt();
        Employe[] emp=new Employe[n];
        for(int i=0;i<n;i++){
            emp[i]=new Employe();
            emp[i].getData();
        }
        System.out.println("Enter your choice");
        System.out.println("1. ArrayDeque");
        System.out.println("2. PriorityQueue");
        System.out.println("3. Exit");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                ArrayDeque<Employe> ad=new ArrayDeque<Employe>();
                for(int i=0;i<n;i++){
                    ad.add(emp[i]);
                }
                System.out.println("ArrayDeque");
                for(Employe e:ad){
                    e.displayData();
                }
                break;
            case 2:
                PriorityQueue<Employe> pq=new PriorityQueue<Employe>();
                for(int i=0;i<n;i++){
                    pq.add(emp[i]);
                }
                System.out.println("PriorityQueue");
                for(Employe e:pq){
                    e.displayData();
                }
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}