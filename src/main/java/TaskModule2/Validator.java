package TaskModule2;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class Validator {
    public static void main(String[] args) {
        String filename = "src/main/java/TaskModule2/plants.xml";
        String schemaName = "src/main/java/TaskModule2/shema.xsd";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);

        try {
            schema = factory.newSchema(new File(schemaName));
            SAXParserFactory spf = SAXParserFactory.newInstance();
            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(filename, new DefaultHandler());
            System.out.println(filename + " is valid");
        } catch (ParserConfigurationException e) {
            System.err.println(filename + " config error: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(filename + " SAX error: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

