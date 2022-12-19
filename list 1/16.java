// Arrange the elements of an array of number in increasing order of their value and
// then decreasing order of their value.

import java.util.Scanner;

class sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // for the how many info you want
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // getting infomation
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the  "+(n+1)+ " elements of the array: ");
            arr[i] = sc.nextInt();
        }
        // this code will sort with the bubble sort technique
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array in increasing order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // for display in dec order
        System.out.println("Array in decreasing order: ");
        // in this indexing is start from the last elment to through first element
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
