// Write a program to find the sum of all integers greater than 100 and less than 200
// that are divisible by 7

import java.util.Scanner;

public class twelve {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount Of minimum number ");
        int min=sc.nextInt();
        System.out.println("Enter Amount Of maximum number ");
        int max=sc.nextInt();
        for (int i = min; i < max; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of all integers greater than 100 and less than 200 that are divisible by 7: " + sum);
        sc.close();
    }
}
