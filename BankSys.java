class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        this.accountNumber = 0;
        this.holderName = "";
        this.balance = 0.0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Avl Balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Avl Balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance" + this.balance);
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Holder Name:    " + this.holderName);
        System.out.println("Current Balance:" + this.balance);
        System.out.println("-----------------------\n");
    }
}

public class BankSys {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.display();

        BankAccount acc2 = new BankAccount(05, "Raunak", 9000000);
        acc2.deposit(200400);
        acc2.withdraw(250000);
        acc2.display();
    }
}
