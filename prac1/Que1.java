package prac1;

// Create a class to represent a bank account, including following members:
//  Data Members:
// 1. Account number
// 2. Name of the depositor
// 3. Type of account (i.e. Savings/Current)
// 4. Balance amount in the account
//  Member Functions:
// 1. To assign initial value
// 2. To deposit an amount
// 3. To withdraw an amount after checking minimum balance (minimum balance is
// 500)
// 4. To display the name and balance

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private String name;
    private String accountType;
    private int balance;

    public BankAccount(int accountNumber, String name, String accountType, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance - amount < 500) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter account type: ");
        String accountType = sc.next();
        System.out.print("Enter balance: ");
        int balance = sc.nextInt();
        BankAccount account = new BankAccount(accountNumber, name, accountType, balance);
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int amount = sc.nextInt();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    account.withdraw(amount);
                    break;
                case 3:
                    account.display();
                    break;
            }
        } while (choice != 4);
    }
}