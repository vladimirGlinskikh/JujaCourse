package anotherExperiments.xml.xmlSaveDom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLSave {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();
            Element rootElement = document.createElement("catalog");
            document.appendChild(rootElement);

            Element book = document.createElement("book");
            rootElement.appendChild(book);

            Element author = document.createElement("author");
            author.setTextContent("Дмитрий Хара");
            book.appendChild(author);

            Element genre = document.createElement("genre");
            genre.setTextContent("Художественная литература");
            book.appendChild(genre);

            Element createBookYear = document.createElement("createBookYear");
            createBookYear.setTextContent("15 августа 2011");
            book.appendChild(createBookYear);

            Element isbn = document.createElement("ISBN");
            isbn.setTextContent("978-5-17-102732-2");
            book.appendChild(isbn);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            DOMSource source = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/books.xml"));

            transformer.transform(source, streamResult);

        } catch (ParserConfigurationException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
