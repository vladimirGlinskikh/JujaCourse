package anotherExperiments.xml.saxParser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParserStart {
    public static void main(String[] args) {
        final String fileName = "/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/exchange.xml";
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            DefaultHandler handler = new DefaultHandler();
        } catch (SAXException | ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    boolean name = false;

    public void StartElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equalsIgnoreCase("name")) {
            name = true;
        }

    }
}

