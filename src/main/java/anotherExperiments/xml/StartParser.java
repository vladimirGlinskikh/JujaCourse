package anotherExperiments.xml;

public class StartParser {
    public static void main(String[] args) {
        XMLParser xmlParser = new XMLParser("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/exchange.xml");
        String value = xmlParser.get("exchange/currency/txt");
        System.out.println(value);
    }
}
