package anotherExperiments.thread.synchronizedExample;

public class Ticket {
    boolean isBought;
    int place;

    Ticket(int place) {
        this.place = place;
    }

    synchronized void buy(Cashier cashier) {
        if (!isBought) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            isBought = true;
            System.out.println("Cashier: " + cashier.id + " ticket" + this.place);
        }
    }
}
