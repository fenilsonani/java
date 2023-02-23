// Create a class Counted that contains an int id. There should be default constructor in
// class Counted. It should print its id and message like "It is being created", when an
// object is being created using new operator. It should also print its id and message like
// "It is being destroyed", when object is destroyed using delete operator.

package prac2;

import java.util.Scanner;

class Counted {
    private int id;
    private static int count = 0;

    public Counted() {
        count++;
        id = count;
        System.out.println("It is being created. ID: " + id);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("It is being destroyed. ID: " + id);
        super.finalize();
    }
}

public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of objects to be created: ");
        int n = sc.nextInt();

        Counted[] counted = new Counted[n];

        for (int i = 0; i < n; i++) {
            counted[i] = new Counted();
        }

        for (int i = 0; i < n; i++) {
            counted[i] = null;
        }

        System.gc();
    }
}