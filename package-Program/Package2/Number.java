package Package2;

import java.util.Scanner;

import Package3.math;


public class Number {
    public static void main(String[] args) {
        int num1,opt;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        num1 = input.nextInt();
        do{
            System.out.println("Enter 1 for Armstrong Number");
            System.out.println("Enter 2 for Prime Number");
            System.out.println("Enter 3 for Palindrome Number");
            System.out.println("Enter 4 to Exit");
            System.out.println("Enter Your Choice: ");
            opt = input.nextInt();
    
            switch(opt){
                case 1:
                    math.getArmstrong(num1);
                    break;
                case 2:
                    math.getPrime(num1);
                    break;
                case 3:
                    math.getPalindrome(num1);
                    break;
                case 4:
                    System.out.println("Thank You");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
    
        }while(0<1);
    }
}
