package anotherExperiments.JSON;

import java.io.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;

public class ParseStarLifeStructure {
    public static final String INSER_PATTERNS_TABLE =
            "INSERT INTO TableListFrom1C (NAMESQL ,NAME1C, MEMO) VALUES ('%1$s','%2$s','%3$s') GO";

    public static final String INSER_PATTERNS_COLUMS =
            "INSERT INTO TableColumnsFrom1C (NAMESQL ,FIELDSSQL, FIELDS1C) VALUES ('%1$s','%2$s','%3$s') GO";

    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new FileInputStream("src/main/resources/StarLife_Structure.xml"));
        doc.getDocumentElement().normalize();
        System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
        NodeList tableElem = doc.getElementsByTagName("TABLE");
        System.out.println("----------------------------");
        for (int table = 0; table < tableElem.getLength(); table++) {
            Node nNode = tableElem.item(table);
//			System.out.println("\nCurrent Element :" + nNode.getNodeName());

//			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
            Element eElement = (Element) nNode;
            String nameSql = eElement.getAttribute("NAMESQL");
            String name1c = eElement.getAttribute("NAME1C");
            String mEMO = eElement.getAttribute("MEMO");
            StringBuilder sbname1c = new StringBuilder();
            StringBuilder sbmEMO = new StringBuilder();
            for (String w : name1c.split("(?<!(^|[А-Я]))(?=[А-Я])|(?<!^)(?=[А-Я][а-я])|_")) {
                sbname1c.append(w.replaceAll("\\.", "")).append(" ");
            }

            for (String w1 : mEMO.split("(?<!(^|[А-Я]))(?=[А-Я])|(?<!^)(?=[А-Я][а-я])|_")) {
                sbmEMO.append(w1.replaceAll("\\.", "")).append(" ");
            }
//			System.out.println("sbname1c="+sbname1c.toString());
            String insertStrTable = String.format(INSER_PATTERNS_TABLE, nameSql, sbname1c.toString()
                    , sbmEMO.toString());
//				System.out.println("Student roll no : " + eElement.getAttribute("NAMESQL"));
            System.out.println(insertStrTable);

            NodeList fieldsNodeList = nNode.getChildNodes();
            for (int field = 0; field < fieldsNodeList.getLength(); field++) {
                Node fieldNode = fieldsNodeList.item(field);
//				System.out.println("\nCurrent Element :" + fieldNode.getNodeName());
                if (fieldNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElementField = (Element) fieldNode;
                    String FIELDSSQL = eElementField.getAttribute("FIELDSSQL");
                    String FIELDS1C = eElementField.getAttribute("FIELDS1C");
                    StringBuilder sbFIELDS1C = new StringBuilder();
                    for (String w : FIELDS1C.split("(?<!(^|[А-Я]))(?=[А-Я])|(?<!^)(?=[А-Я][а-я])|_")) {
                        sbFIELDS1C.append(w.replaceAll("\\.", "")).append(" ");
                    }

                    String insertStrTableColumns = String.format(INSER_PATTERNS_COLUMS, nameSql, FIELDSSQL
                            , sbFIELDS1C.toString());
//					System.out.println(insertStrTableColumns);
                }
            }
        }
    }
}
