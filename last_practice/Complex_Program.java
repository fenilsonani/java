// Suppose you are building a multi-threaded application for a bank that processes customer
// transactions. The application has a shared account object that represents a customer&#39;s bank
// account. The account object has a balance field that stores the current balance of the account.
// Multiple threads run concurrently in the application, and each thread represents a customer
// who performs a transaction. Each transaction involves deducting or adding a certain amount
// of money from the account balance.
// When one thread is modifying the account balance, no other thread should be able to read or
// modify the balance field simultaneously.
// Note: Use synchronized keyword

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class Customer implements Runnable {
    private BankAccount account;

    public Customer(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("Overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep");
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        Customer customer1 = new Customer(account);
        Customer customer2 = new Customer(account);
        Thread thread1 = new Thread(customer1, "Customer 1");
        Thread thread2 = new Thread(customer2, "Customer 2");
        thread1.start();
        thread2.start();
    }
}