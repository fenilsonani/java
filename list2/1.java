package java.list2;
import java.util.*;

class Account {
    String name,type;
    int accno,amount;
    Account(){
        name="";
        type="";
        accno=0;
        amount=10000;
    }
    void dipositeAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount You Want To deposite");
        amount=sc.nextInt();
        checkBalance();
        sc.close();
    }
    void checkBalance(){
        System.out.println("Your Account Balance Is a : "+amount );
    }
    void withdrawAmount(){
        if (amount>0) {
            System.out.println("You Cant Withdraw Amount Please Deposite Amount First");
        }else{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Amount You Want to Withdraw");
            int wdAmt=sc.nextInt();
            if (wdAmt>amount) {
                System.out.println("You Cant Withdraw Amount");
            }else{
                System.out.println("SuccessFully WithDraw Amount");
                checkBalance();
            }
            sc.close();
        }
    }
}

class first_s{
    public static void main(String[] args) {
        do {
            Account ac=new Account();
            System.out.println("1.CheckBalance");
            System.out.println("2.Deposite");
            System.out.println("3.WithDraw");
            System.out.println("3.Exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Option");
            int opt=sc.nextInt();
            switch (opt) {
                case 1:
                    ac.checkBalance();
                    break;
                case 2:
                    ac.dipositeAmount();
                    break;

                case 3:
                    ac.withdrawAmount();
                    break;

                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            sc.close();
        } while (0<1);
    }
}