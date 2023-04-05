package meet;
import java.util.LinkedList;
import java.util.Scanner;

import meet.Account;

public class AccountHandler {
    public static void main(String[] args) {
        // Account ac=new Account();
        // ac.getData();
        // ac.displayData();
        // System.out.println("Enter Amount To Withdraw");
        Scanner sc=new Scanner(System.in);
        // int wamt=sc.nextInt();
        // try{
        //     ac.withdraw(wamt);
        // }catch(BalanceException e){
        //     System.out.println(e);
        // }
        // System.out.println("Enter Amount To Deposite");
        // int dpamt=sc.nextInt();
        // ac.deposit(dpamt);
        int opt=0;
        LinkedList<Account> list=new LinkedList<Account>();
        do {
            System.out.println("0.Exit\n1.Enter new Data\n2.View Specific Account\n3.Display All Account Detail\n4.Withdraw\n5.Deposite");
            opt=sc.nextInt();
            switch (opt) {
                case 0:
                System.out.println("Exiting......");
                    System.exit(0);
                    break;

                case 1:
                    Account ac=new Account();
                    ac.getData();
                    list.add(ac);
                    break;
                case 2:
                    System.out.println("Enter Account No You Want TO diplay");
                    int temp=sc.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).accno==temp){
                            list.get(i).displayData();
                            break;
                        }
                    }
                    break;
                
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        // if(list.get(i).accno==temp){
                            list.get(i).displayData();
                            // break;
                        // }
                    }
                case 4:
                    System.out.println("Enter Account No You Want TO Withdraw");
                    int temp1=sc.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).accno==temp1){
                            System.out.println("Enter Amount You Want To Withdraw");
                            int wamt=sc.nextInt();
                            try {
                                list.get(i).withdraw(wamt);
                                break;
                            } catch (BalanceException e) {
                                // TODO: handle exception
                                System.out.println(e);
                                // break;
                            }
                        }
                    }
                break;

                case 5:
                    System.out.println("Enter Account No You Want TO Deposite");
                    int temp2=sc.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if(list.get(i).accno==temp2){
                            System.out.println("Enter Amount You Want To Deposite");
                            int dpamt=sc.nextInt();
                            list.get(i).deposit(dpamt);
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Incalid Input!");
                    break;
            }
            
        } while (true);
    }
}
