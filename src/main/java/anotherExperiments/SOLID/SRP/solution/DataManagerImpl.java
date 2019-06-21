package anotherExperiments.SOLID.SRP.solution;

public class DataManagerImpl implements IDataManager {
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
