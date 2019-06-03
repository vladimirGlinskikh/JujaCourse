package anotherExperiments.xml.xmlParser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class StartParser {
    public static void main(String[] args) {
//        XMLParser xmlParser = new XMLParser("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/exchange.xml");
//        String value = xmlParser.get("exchange/currency/txt");
//        System.out.println(value);
        File xmlFile = new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/exchange.xml");


        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(xmlFile);
            Element root = document.getDocumentElement();
            System.out.println("Root element: " + root.getNodeName());
            System.out.println("------------------------------");

            NodeList nodeList = root.getChildNodes();

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("currency: ");
                    System.out.println("r030: " + element.getElementsByTagName("r030").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("txt: " + element.getElementsByTagName("txt").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("rate: " + element.getElementsByTagName("rate").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("cc : " + element.getElementsByTagName("cc").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("exchangedate: " + element.getElementsByTagName("exchangedate").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("--------------------------------------");
                    System.out.println(" ");
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }
}
