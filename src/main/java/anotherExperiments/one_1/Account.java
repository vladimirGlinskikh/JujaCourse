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
}
