package pkg1;

import java.util.Scanner;

// Write a menu driven program that manages the functionalities of Library. Give choice to
// the user, to perform from following operation:
// 1. Member Detail
// 2. Book Detail
// 3. Exit
//  Member Detail – Manages stuff related to members.
//  Book Detail – Manages stuff related to books.
//  Exit – to close application

class Library{
    /**
     * 
     */
    void memberdetail(){
        System.out.println("Libraryan 1 is a : Fenil");
        System.out.println("Email is a :21bmiit160@gmail.com");
        System.out.println("Contact No: 8320550560");
    }
    void bookdetail(){
        System.out.println("Book1 is a : linux and shell programing");
        System.out.println("Author : NA");
        System.out.println("Price : 400");
        System.out.println("Publication time : 1,jan 2022");
    }
}

public class class3 {
    public static void main(String[] args) {
        int opt;
        Scanner sc=new Scanner(System.in);
        Library l1=new Library();
        do {
            System.out.println("Enter Option");
            System.out.println("1.Member Detail");
            System.out.println("2.BookDetail");
            System.out.println("3.Exit");
            opt=sc.nextInt();
            switch (opt) {
                case 1:
                    l1.memberdetail();
                    break;
                case 2:
                    l1.bookdetail();
                    break;
                case 3:
                    System.exit(0);
                    break;
                
                default:
                    break;
            }
        } while (0<1);
        // sc.close();
    }
}
