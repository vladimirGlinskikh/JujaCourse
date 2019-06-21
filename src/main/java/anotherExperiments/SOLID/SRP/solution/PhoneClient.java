package anotherExperiments.SOLID.SRP.solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImpl(), new DataManagerImpl());

        phone.dial("+7(707)8971256");
        phone.disconnect();

        phone.send("We got some message!");
        phone.receive();
    }
}
