package anotherExperiments.SOLID;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("+7(707)5678923");
        phone.send("something text");
        phone.receive();
        phone.disconnect();
    }
}
