package anotherExperiments.xml.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;

public class App {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Book("Artur Daly", "Документальная литература", "Общая психология", "15 августа 2011", "978-5-04-199323-4"));
        catalog.add(new Book("Марина Хорс", "Художественная литература", "Озеро на острове", "15 августа 2011", "972-5-01-989323-3"));

        try {
            File file = new File("/home/vladimir/Documents/IdeaProjects/JujaCourse/src/main/resources/books.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            marshaller.marshal(catalog, file);
            marshaller.marshal(catalog, System.out);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            catalog = (Catalog) unmarshaller.unmarshal(file);
            System.out.println(catalog);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
