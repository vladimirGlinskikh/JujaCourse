package anotherExperiments.thread.synchronizedExample;

public class Cashier extends Thread {
    int id;
    Ticket[] tickets;

    Cashier(int id, Ticket[] tickets) {
        this.id = id;
        this.tickets = tickets;
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < tickets.length; i++) {
            tickets[i].buy(this);
        }
    }
}
