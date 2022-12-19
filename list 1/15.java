// Write a program to print the following outputs using for loops:
// $ $ $ $ $
// $ $ $ $
// $ $ $
// $ $

import java.util.Scanner;

class pattern {
    void paa1(int line) {
        for (int i = line; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }

    void paa2(int line) {
        for (int i = 1; i <= line; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(0);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    void paa3(int line) {
        for(int i=1;i<=line;i++){
            for (int j = 1; j <= line-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class fiteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows You Wanna Print: ");
        int lines = sc.nextInt();
        System.out.println("Enter Option: ");
        int opt = sc.nextInt();
        System.out.println("1.Pattern 1");
        System.out.println("2.Pattern 2");
        System.out.println("3.Pattern 3");
        pattern p = new pattern();
        switch (opt) {
            case 1:
                p.paa1(lines);
                break;

            case 2:
                p.paa2(lines);
                break;

            case 3:
                p.paa3(lines);
                break;

            default:
                break;
        }
        sc.close();
    }
}