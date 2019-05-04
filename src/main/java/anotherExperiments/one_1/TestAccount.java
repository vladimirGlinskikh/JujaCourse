package anotherExperiments.one_1;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(-265.09);
        System.out.println("account balance: " + account.getBalance());
        account.deposit(265.09);
        account.withDraw(200.00);
        System.out.println("account balance: " + account.getBalance());
    }
}
