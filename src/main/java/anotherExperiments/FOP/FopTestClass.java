package anotherExperiments.FOP;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.xml.sax.SAXException;

public class FopTestClass {
    public static void main(String[] args) {
        try {
            FopFactory fopFactory = FopFactory.newInstance(new File("")); // FOP-Konfiguration
            OutputStream out = new BufferedOutputStream(new FileOutputStream(new File("myfile.pdf")));
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer();
            File fo = new File("");
            Source src = new StreamSource(fo);
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(src, res);
            out.close();
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
