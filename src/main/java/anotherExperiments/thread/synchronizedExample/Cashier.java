package anotherExperiments.thread.synchronizedExample;

public class Cashier extends Thread {
    int id;
    Ticket[] tickets;

    Cashier(int id, Ticket[] tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    @Override
    public void run() {
        for (int i = 0; i < tickets.length; i++) {
            if (!tickets[i].isBought) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.err.println(e);
                }
                tickets[i].isBought = true;
                System.out.println("Cashier: " + id + " " + "ticket: " + tickets[i].place);
            }
        }
    }
}
