package anotherExperiments.xml.saxParser;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParserStart {
    public static void main(String[] args) {
        final String fileName = "/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/phonebook.xml";
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {

                boolean name = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) {
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }
                }

                @Override
                public void characters(char ch[], int start, int length) {
                    if (name) {
                        System.out.println("Name: " + new String(ch, start, length));
                        name = false;
                    }
                }
            };
            saxParser.parse(fileName, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

