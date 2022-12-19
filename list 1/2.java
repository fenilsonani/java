// Write a program to read the price of item in decimal form (like 75.95) from command line argument and print the output in paisa (like 7595 paisa).

import java.util.Scanner;

class second{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of item in decimal form: ");
        float price = sc.nextFloat();
        int paisa = (int) (price * 100);
        System.out.println("Price in paisa: " + paisa + " paisa");
        sc.close();
    }
}