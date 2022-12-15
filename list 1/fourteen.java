// Given a number, write a program using while loop to reverse the digits of the
// number. For example, the number 12345 should be written as 54321

import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num =num / 10;
        }
        System.out.println("Reverse of the number: " + rev);
        sc.close();
    }

}
