package anotherExperiments.SOLID.SRP.solution;

public class Phone implements IConnectionManager, IDataManager {

    private IConnectionManager connection;
    private IDataManager dataChannel;

    public Phone(IConnectionManager connection, IDataManager dataManager) {
        this.connection = connection;
        this.dataChannel = dataManager;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();
    }

    @Override
    public void send(String message) {
        dataChannel.send(message);
    }

    @Override
    public int receive() {
        return dataChannel.receive();
    }
}
