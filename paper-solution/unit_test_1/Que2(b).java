// write a program to declare and initialize array of five number.take two number indices from the user to perform array[index1]/array[index2].raising of exception is totally depends on the user input.Handel the required exception by writing multiple catch statement.

import java.util.Scanner;

class MyMain {
    public static void main(String[] args) {
        try{
            int[] arr = {1,2,3,4,5};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Index 1");
            int index1 = sc.nextInt();
            System.out.println("Enter Index 2");
            int index2 = sc.nextInt();
            System.out.println(arr[index1]/arr[index2]);
            sc.close();
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch(Exception e){
            System.out.println("Exception");
        }
    }
}