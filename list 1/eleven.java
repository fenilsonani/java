// Write a menu driven program to perform following task on 1D array:
// 1. Total number of even integers
// 2. Total number of odd integers
// 3. Sum of all even integers
// 4. Sum of all odd integers

import java.util.Scanner;

class Calculation{
    int totalEven = 0;
    int totalOdd = 0;
    int sumEven = 0;
    int sumOdd = 0;
    int n[];
    int number;

    Calculation(){
       
    }

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        number=sc.nextInt();
        n=new int[number];
        System.out.println("Enter The Array Input:");
        for(int i=0;i<number;i++){
            n[i]=sc.nextInt();
        }
    }
    void totalEven(){
        for(int i=0;i<number;i++){
            if(n[i]%2==0){
                totalEven++;
            }
        }
        System.out.println("Total Even Number:"+totalEven);
    }
    void totalOdd(){
        for(int i=0;i<number;i++){
            if(n[i]%2!=0){
                totalOdd++;
            }
        }
        System.out.println("Total Odd Number:"+totalOdd);
    }
    void sumEven(){
        for(int i=0;i<number;i++){
            if(n[i]%2==0){
                sumEven+=n[i];
            }
        }
        System.out.println("Sum of Even Number:"+sumEven);
    }
    void sumOdd(){
        for(int i=0;i<number;i++){
            if(n[i]%2!=0){
                sumOdd+=n[i];
            }
        }
        System.out.println("Sum of Odd Number:"+sumOdd);
    }
}

class eleven{
    public static void main(String[] args) {
        Calculation cal=new Calculation();
        do {
            int opt;
            System.out.println("1.Enter The Data");
            System.out.println("2.Total number of even integers");
            System.out.println("3.Total number of odd integers");
            System.out.println("4.Sum of all even integers");
            System.out.println("5.Sum of all odd integers");
            System.out.println("6.All of the above");
            System.out.println("7.Exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("*******************Enter the option*******************");
            opt=sc.nextInt();

            // write a switch case to perform the task

            switch (opt) {
                case 1:
                    cal.getdata();
                    break;
                case 2:
                    cal.totalEven();
                    break;
                case 3:
                    cal.totalOdd();
                    break;
                case 4:
                    cal.sumEven();
                    break;
                case 5:
                    cal.sumOdd();
                    break;
                case 6:
                    cal.totalEven();
                    cal.totalOdd();
                    cal.sumEven();
                    cal.sumOdd();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        } while (0<1);
    }
}