// Write a program to print all possible combinations of three digits. Take care that no
// combination gets repeated

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Please Not Down Number Should Be One One Digit");
        System.out.println("Enter the number: ");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                    }
                }
            }
        }
        sc.close();
    }
}
