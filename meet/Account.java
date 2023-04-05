package meet;

import java.util.Scanner;

public class Account {
    public int accno,balance;
    public String name,acctype;
    public Account(){
        accno=0;
        name="";
        acctype="";
        balance=0;
    }
    public void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter accno");
        accno=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name In this Foramte (FirstName FathernName LastName)");
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter acctype");
        acctype=sc.nextLine();
        System.out.println("Enter balance");
        balance=sc.nextInt();
    }
    public void displayData(){
        System.out.println("accno: " + accno);
        System.out.println("name: " + name);
        System.out.println("acctype: " + acctype);
        System.out.println("balance: " + balance);
    }
    //function that will return the balance
    public int getBalance(){
        return balance;
    }
    //function that deposit the amount
    public void withdraw(int amount) throws BalanceException{
        if(amount>balance){
            throw new BalanceException("You can't Withdraw more than your balance");
        }else{
            balance-=amount;
        }
    }   
    //function that withdraw the amount
    public void deposit(int amount){
        balance+=amount;
    }
}