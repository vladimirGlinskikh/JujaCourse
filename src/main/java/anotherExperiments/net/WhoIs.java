package anotherExperiments.net;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIs {
    public static void main(String[] args) throws Exception {
        int c;
        Socket socket = new Socket("ozon.ru", 43);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        String string = (args.length == 0 ? "ozon.ru" : args[0] + "\n");
        byte buf[] = string.getBytes();

        outputStream.write(buf);
        while ((c = inputStream.read()) != -1) {
            System.out.println((char) c);
        }
        socket.close();
    }
}
