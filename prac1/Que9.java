package prac1;

// Create a class called “counter” by using appropriate methods count number of objects 
// using static data members and member function.

import java.util.Scanner;

class Counter {
    private static int count = 0;

    public Counter() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Que9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of objects: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Counter counter = new Counter();
        }
        System.out.println("Number of objects: " + Counter.getCount());
    }
}