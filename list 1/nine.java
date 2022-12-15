// // Write a program to accept amount as command line argument and display total
// number of notes of Rs. 500, 100, 50, 20, 10, 5, 2, 1. Find minimum number of notes
// required for the given domination

import java.util.Scanner;

class nine {
    public static void main(String[] args) {

        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int notes500 = amount / 500;
        int notes100 = (amount % 500) / 100;
        int notes50 = ((amount % 500) % 100) / 50;
        int notes20 = (((amount % 500) % 100) % 50) / 20;
        int notes10 = ((((amount % 500) % 100) % 50) % 20) / 10;
        int notes5 = (((((amount % 500) % 100) % 50) % 20) % 10) / 5;
        int notes2 = ((((((amount % 500) % 100) % 50) % 20) % 10) % 5) / 2;
        int notes1 = (((((((amount % 500) % 100) % 50) % 20) % 10) % 5) % 2) / 1;
        System.out.println("Total number of notes of Rs. 500: " + notes500);
        System.out.println("Total number of notes of Rs. 100: " + notes100);
        System.out.println("Total number of notes of Rs. 50 : " + notes50);
        System.out.println("Total number of notes of Rs. 20 : " + notes20);
        System.out.println("Total number of notes of Rs. 10 : " + notes10);
        System.out.println("Total number of notes of Rs. 5  : " + notes5);
        System.out.println("Total number of notes of Rs. 2  : " + notes2);
        System.out.println("Total number of notes of Rs. 1  : " + notes1);
    }
}