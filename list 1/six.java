// Write a program to convert given no. of days into months, years and days; assume
// that each month is of 30 days. For Example: if input is 69 than Output is 2 months
// and 9 days.

import java.util.Scanner;

public class DateValue{
    public static void main(String[] args) {
        System.out.println("Enter the number of days: ");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int months = days / 30;
        int years = months / 12;
        int remainingDays = days % 30;
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + remainingDays);
    }
}