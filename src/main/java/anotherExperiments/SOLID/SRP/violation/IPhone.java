package anotherExperiments.SOLID.SRP.violation;

public interface IPhone {

    void dial(String phoneNumber);

    void disconnect();

    void send(String message);

    int receive();
}
