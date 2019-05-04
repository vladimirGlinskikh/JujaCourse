package anotherExperiments.one_1;

public class Account {
    private double balance;

    public Account(double balance) {

        if (this.balance >= 0) {
            this.setBalance(balance);
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withDraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}
