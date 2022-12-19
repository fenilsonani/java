// Write a program to find the sum of each row of the n*n matrix and sum of each
// column of the n*n matrix. Note that store the sum of each row in single-dimensional
// array (sumrow[n]) and sum of each column in single-dimensional array (sumcol[n]).


import java.util.Scanner;

class seventeen{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] sumrow = new int[n];
        int[] sumcol = new int[n];
        System.out.println("Enter the elements of matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ 
                System.out.println("Enter the element at position: " + i + " " + j);
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                sumrow[i] += matrix[i][j];
                sumcol[j] += matrix[i][j];
            }
        }
        System.out.println("Sum of each row of the n*n matrix: ");
        for(int i = 0; i < n; i++){
            System.out.println(sumrow[i]);
        }
        System.out.println("Sum of each column of the n*n matrix: ");
        for(int i = 0; i < n; i++){
            System.out.println(sumcol[i]);
        }
        sc.close();

    }
}