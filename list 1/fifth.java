// Write a program in which there are three variables whose data type is byte, int and
// double; the value of int is 260 and value of double is 323.142. Convert the value of int
// into byte, double into int and double into byte and display all the values after
// conversion

import java.util.Scanner;

public class fifth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intVariable = 260;
        double doubleVariable = 323.142;
        byte byteVariable = 0;
        byte byteVariable1 = 0;
        int intVariable1 = 0;
        byteVariable = (byte) intVariable;
        byteVariable1 = (byte) doubleVariable;
        intVariable1 = (int) doubleVariable;       
        System.out.println("Double variable: " + doubleVariable);
        System.out.println("Double Int variable: " + intVariable1);
        System.out.println("Double Byte variable: " + byteVariable1);
        System.out.println("Int variable: " + intVariable);
        System.out.println("Int Byte variable: " + byteVariable);
    }
}