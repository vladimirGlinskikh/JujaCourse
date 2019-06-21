package anotherExperiments.SOLID.SRP.violation;

public class Phone implements IPhone {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Somebody calling!");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected...");
    }

    @Override
    public void send(String message) {
        System.out.println("data sent successfully!");
    }

    @Override
    public int receive() {
        System.out.println("data receive successfully!");
        return 0;
    }
}
