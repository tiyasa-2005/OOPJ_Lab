package Day_4;
import java.util.*;

class Account {
    static int id = 1000;
    int accountNumber;
    String acc_type;
    String name;
    double balance;
    int d, m, y;

    Account(String name, String accountType, double initialBalance, int d, int m, int y) {
        this.accountNumber = ++id;
        this.name = name;
        this.acc_type = accountType;
        this.balance = initialBalance;
        this.d = d;
        this.m = m;
        this.y = y;
    }

    void checkBalance() {
        System.out.println("Account Info-\nAccount No: " + accountNumber + "\nName: " + name +
                "\nType: " + acc_type + "\nBalance: Rs " + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount + "\nNew Balance: Rs " + balance);
        }
    }

    void withdraw(double amount) {
        System.out.println("Processing withdrawal...");
    }
}

class PremiumAccount extends Account {
    PremiumAccount(String name, double initialBalance, int d, int m, int y) {
        super(name, "Premium", initialBalance, d, m, y);
    }
    void withdraw(double amount) {
        if (amount > 1000000) {
            System.out.println("Transaction Failed: Premium daily limit is Rs 10 Lakh.");
        }
        else if (amount > balance) {
            System.out.println("Transaction Failed: Insufficient funds.");
        }
        else {
            balance -= amount;
            System.out.println("Success! Withdrawn: Rs " + amount + "\nCurrent Balance: Rs " + balance);
        }
    }
}

class StandardAccount extends Account {
    StandardAccount(String name, double initialBalance, int d, int m, int y) {
        super(name, "Standard", initialBalance, d, m, y);
    }
    void withdraw(double amount) {
        if (amount > 500000) {
            System.out.println("Transaction Failed: Standard daily limit is Rs 5 Lakh.");
        }
        else if (amount > balance) {
            System.out.println("Transaction Failed: Insufficient funds.");
        }
        else {
            double penalty = 0;
            if (amount > 100000) {
                penalty = amount * 0.0005;
                System.out.println("Note: 0.05% penalty of Rs " + penalty + " applied.");
            }
            balance -= (amount + penalty);
            System.out.println("Success! Withdrawn: Rs " + amount + "\nTotal Deducted: Rs " + (amount + penalty));
            System.out.println("Current Balance: Rs " + balance);
        }
    }
}

class prog_4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account userAcc = null;
        System.out.println("Welcome to the Bank\n");
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Initial Deposit: ");
        double initial = sc.nextDouble();
        System.out.print("Enter Date (Day Month Year): ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Select Account Type: 1. Standard  2. Premium");
        int choice = sc.nextInt();
        if (choice == 1) {
            userAcc = new StandardAccount(name, initial, d, m, y);
        }
        else {
            userAcc = new PremiumAccount(name, initial, d, m, y);
        }
        boolean running = true;
        while (running) {
            System.out.println("\n1. Check Balance  2. Deposit  3. Withdraw  4. Exit");
            System.out.print("Choice: ");
            int action = sc.nextInt();

            switch (action) {
                case 1: userAcc.checkBalance(); break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    userAcc.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    userAcc.withdraw(sc.nextDouble());
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default: System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}