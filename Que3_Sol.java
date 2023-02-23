import java.util.Scanner;

// Assume that a bank maintains two kinds of accounts for customers, one called as savings
// accounts and the other as current accounts. The savings account provides compound
// interest and withdrawal facilities but no cheque book facility. The current account
// provides cheque book facility but no interest. Current account holder should also
// maintain a minimum balance and if the balance falls below the service charge is imposed.
// Create a class account that stores customer name, account number and type of account.
// From this derive the classes CurrentAccount and SavingsAccount to make them more
// specific to their requirements. In main create object of current & savings accounts and
// perform following operation on both objects:
// I. Accept deposit from the customer and update the balance.
// II. Calculate interest.
// Write a program to implement given scenario.

class Account {
    String name, tyAcc;
    int accNo, balance;

    Account(String name, String tyAcc, int accNo, int balance) {
        this.name = name;
        this.tyAcc = tyAcc;
        this.accNo = accNo;
        this.balance = balance;
    }

    int getAccNo() {
        return accNo;
    }

    String getName() {
        return name;
    }

    String getTyAcc() {
        return tyAcc;
    }

    void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTyAcc(String tyAcc) {
        this.tyAcc = tyAcc;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void displayAccountDetail() {
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account No : " + accNo);
        System.out.println("Type Of Account: " + tyAcc);
        System.out.println("Balance : " + balance);
    }

}

class Saving extends Account {

    int interest;

    Saving(String name, String tyAcc, int accNo, int balance) {

        super(name, tyAcc, accNo, balance);
    }

    int calinterest() {
        interest = (int) (balance * 1 * 2.5) / 100;
        return interest;
    }
}

class Current extends Account {
    int pen;
    boolean chequeisuued;

    Current(String name, String tyAcc, int accNo, int balance, boolean chequeisuued) {
        super(name, tyAcc, accNo, balance);
        this.chequeisuued = chequeisuued;
        pen = 500;
    }

    int checkMinBalance() {
        if (balance < 10000) {
            return balance = balance - pen;
        } else {
            return balance;
        }
    }

    boolean getcheckBookIsuue() {
        checkMinBalance();
        return chequeisuued;
    }

    void setcheckBookIsuue() {
        checkMinBalance();
        this.chequeisuued = true;
    }

}

class MyMain {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Account Holder Name");
        String name = sc.next();
        System.out.println("Enter The Account No");
        int accNo = sc.nextInt();
        System.out.println("Enter the Type Of Account");
        String tyAcc = sc.next();
        System.out.println("Enter Balance");
        int balace = sc.nextInt();
        int opt;
        if (tyAcc.equals("Saving") || tyAcc.equals("saving")) {

            System.out.println("Your Type Of Account Is a Saving");

            Saving sv = new Saving(name, tyAcc, accNo, balace);

            do {

                System.out.println("1.Account Details");
                System.out.println("2.Deposite");
                System.out.println("3.CheckBalance");
                System.out.println("4.Exit");
                System.out.println("Enter Option");
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        sv.displayAccountDetail();
                        break;

                    case 2:
                        System.out.println("Enter Amount You Want To Deposite");
                        int temp = sc.nextInt();
                        sv.deposit(temp);
                        break;

                    case 3:
                        sv.balance = sv.balance + sv.calinterest();
                        System.out.println("Your Account Balance Is a " + sv.getBalance());
                        break;

                    case 4:
                        System.exit(1);
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }

            } while (0 < 1);
        } else {
            System.out.println("Your Type Of Account Is a Current");

            Current sv = new Current(name, tyAcc, accNo, balace, false);

            do {

                System.out.println("1.Account Details");
                System.out.println("2.Deposite");
                System.out.println("3.CheckBalance");
                System.out.println("4.CheqBook Status");
                System.out.println("5.Issue CheckBook");
                System.out.println("6.Exit");
                System.out.println("Enter Option");
                opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        sv.displayAccountDetail();
                        break;

                    case 2:
                        System.out.println("Enter Amount You Want To Deposite");
                        int temp = sc.nextInt();
                        sv.deposit(temp);
                        break;

                    case 3:
                        System.out.println("Your Account Balance Is a " + sv.getBalance());
                        break;

                    case 4:
                        System.out.println("ChekBook Status Is a " + sv.getcheckBookIsuue());
                        break;

                    case 5:
                        sv.setcheckBookIsuue();
                        System.out.println("Now CheckBook Status Is a " + sv.getcheckBookIsuue());
                        break;

                    case 6:
                        System.exit(1);
                        break;

                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } while (0 < 1);

        }
    }
}