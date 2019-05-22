package anotherExperiments.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class SimpleURL {
    public static void main(String[] args) throws MalformedURLException {
        URL nbuApi = new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(nbuApi.openStream()));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
