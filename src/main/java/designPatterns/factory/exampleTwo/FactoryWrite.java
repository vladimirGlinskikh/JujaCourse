package designPatterns.factory.exampleTwo;

import org.w3c.dom.Document;

import java.io.File;

public class FactoryWrite {
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;

        if (object instanceof File) {
            writer = new FileWriter();
        } else if (object instanceof Document) {
            writer = new XmlWriter();
        }
        return writer;
    }
}
