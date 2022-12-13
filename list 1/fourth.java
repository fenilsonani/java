// Write a program to display character of given ASCII number.
// E.g. intasciiNumber=65, Output would be A.

import java.util.Scanner;

public class Ascii{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ASCII number: ");
        int asciiNumber = sc.nextInt();
        char character = (char) asciiNumber;
        System.out.println("Character of given ASCII number: " + character);
    }
}