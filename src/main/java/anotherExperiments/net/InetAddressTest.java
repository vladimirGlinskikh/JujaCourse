package anotherExperiments.net;

import java.net.*;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);

        address = InetAddress.getByName("ozon.ru");
        System.out.println(address);

        InetAddress SW[] = InetAddress.getAllByName("ozon.ru");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
