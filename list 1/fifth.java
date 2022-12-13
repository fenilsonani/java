// Write a program in which there are three variables whose data type is byte, int and
// double; the value of int is 260 and value of double is 323.142. Convert the value of int
// into byte, double into int and double into byte and display all the values after
// conversion

import java.util.Scanner;

public class Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte byteVariable = 0;
        int intVariable = 260;
        double doubleVariable = 323.142;
        byteVariable = (byte) intVariable;
        intVariable = (int) doubleVariable;
        doubleVariable = (double) byteVariable;
        System.out.println("Byte variable: " + byteVariable);
        System.out.println("Int variable: " + intVariable);
        System.out.println("Double variable: " + doubleVariable);
    }
}