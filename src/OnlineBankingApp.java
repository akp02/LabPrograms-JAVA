/*Simulate the basic functions for the Online Banking Application. Consider a bank offering online access to its customers to perform transactions. Suppose there are two transactions of deposit for a particular account simultaneously which leads to race conditions. Develop a solution to avoid the unpredictable situation. */
import java.util.concurrent.locks.ReentrantLock;
class BankAccount {
    private double balance; private ReentrantLock lock;
    public BankAccount(double balance) {
        this.balance = balance;
        lock = new ReentrantLock();
    }
    public void deposit(double amount) { 
        lock.lock();
        try {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance); 
        } 
        finally {
            lock.unlock(); 
        }
    }
    public void withdraw(double amount) { 
        lock.lock();
        try {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance); 
        } 
        finally {
            lock.unlock(); 
        }
    }
    public double getBalance() { 
        return balance;
    } 
}
class BankTransaction implements Runnable { 
    private BankAccount account;
    private double amount;
    public BankTransaction(BankAccount account, double amount) { 
        this.account = account;
        this.amount = amount;
    }
    public void run() { 
        account.deposit(amount);
    } 
}

    public class OnlineBankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        Thread t1 = new Thread(new BankTransaction(account, 500)); 
        Thread t2 = new Thread(new BankTransaction(account, 600)); 
        t1.start();
        t2.start();
        } 
}
            