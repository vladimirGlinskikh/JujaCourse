package anotherExperiments.thread.synchronizedExample;

public class Main {
    public static void main(String[] args) {
        Ticket[] ticket = {
                new Ticket(19),
                new Ticket(12),
                new Ticket(13),
                new Ticket(17),
                new Ticket(11),
        };
        Cashier cashier = new Cashier(1, ticket);
        Cashier cashier1 = new Cashier(2, ticket);
        Cashier cashier2 = new Cashier(3, ticket);
        Cashier cashier3 = new Cashier(4, ticket);
        Cashier cashier4 = new Cashier(5, ticket);

        cashier.start();
        cashier1.start();
        cashier2.start();
        cashier3.start();
        cashier4.start();
    }
}
