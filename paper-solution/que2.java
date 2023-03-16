// write a program that creates userdefine class called student with the members sid,sname,semester and specilization and than create many object of this class and store them in linkedlist provide menu for insertion deletion traversel.

import java.util.Scanner;
import java.util.LinkedList;

class Student
{
    int sid;
    String sname,semester,specilization;
    
    void getdata(){
        System.out.println("Enter id");
        Scanner sc=new Scanner(System.in);
        sid=sc.nextInt();
        System.out.println("ENter Name");
        sname=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Semester");
        semester=sc.nextLine();
        System.out.println("Enter Spec");
        specilization=sc.nextLine();
        sc.close(); 
    }
    void displayData(){
        System.out.println("sid: " + sid);
        System.out.println("specilization: " + specilization);
        System.out.println("semester: " + semester);
        System.out.println("sname: " + sname);
    }
}

class MyMain
{
    public static void main(String[] args) {
        LinkedList<Student> list=new LinkedList<Student>();
        do{
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    Student s=new Student();
                    s.getdata();
                    list.add(s);
                    break;
                case 2:
                    System.out.println("Enter Student Id to delete");
                    int id=sc.nextInt();
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).sid==id){
                            list.remove(i);
                            break;
                        }
                    }
                    break;
                case 3:
                    for(int i=0;i<list.size();i++){
                        list.get(i).displayData();
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }while(0<1);
    }
}