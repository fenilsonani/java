// Admission to a professional course is subject to the following conditions:
// Marks in mathematics >=60
// Marks in physics >=50
// Marks in chemistry >=40
// Total in all three subjects >=200
// OR
// Total in mathematics and physics >=150
// Given the marks in the three subject, write a program to process the applications to
// list the eligible candidates.

import java.util.Scanner;

class CalculatioProcess{
    public static void main(String[] args) {
        int math,phy,chem,total;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name");
        name=sc.nextLine();
        System.out.println("Enter Tha Marks Of Math");
        math=sc.nextInt();
        System.out.println("Enter Tha Marks Of Physics");
        phy=sc.nextInt();
        System.out.println("Enter Tha Marks Of Chemistry");
        chem=sc.nextInt();
        total=math+phy+chem;
        if(math>=60 && phy>=50 && chem>=40 && total>=200){
            System.out.println(name+" You Are Eligible For Admission");
        }
        else if((math+phy)>=150){
            System.out.println(name+" You Are Eligible For Admission");
        }
        else{
            System.out.println(name+" You Are Not Eligible For Admission");
            System.out.println("Please Try Again Next Year");
        }
    }
}