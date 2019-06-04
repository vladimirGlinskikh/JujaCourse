package anotherExperiments.JSON.gson.parser;

import anotherExperiments.JSON.gson.entity.CurrencyRate;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GsonParser {
    public static void parseJson(String url) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();

        Gson gson = gsonBuilder.create();

        JsonReader jsonReader = new JsonReader(new InputStreamReader(new URL(url).openStream()));
        CurrencyRate[] currencyRates = gson.fromJson(jsonReader, CurrencyRate[].class);
        for (CurrencyRate rate : currencyRates) {
            System.out.println(rate);
        }
        String gsonString = gson.toJson(currencyRates);
        Files.write(Paths.get("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/gsonCurrency.json"),
                gsonString.getBytes(), StandardOpenOption.CREATE);
    }
}
