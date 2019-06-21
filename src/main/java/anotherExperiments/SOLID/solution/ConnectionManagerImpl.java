package anotherExperiments.SOLID.solution;

public class ConnectionManagerImpl implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Somebody calling!");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected...");
    }
}
