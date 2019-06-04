package anotherExperiments.JSON.gson;

import anotherExperiments.JSON.gson.parser.GsonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        GsonParser.parseJson("https://api.privatbank.ua/p24api/pubinfo?exchange&json&coursid=11");
    }
}
