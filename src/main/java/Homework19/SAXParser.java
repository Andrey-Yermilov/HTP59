package Homework19;


import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;

public class SAXParser {
    public static void main(String[] args) throws SAXException, IOException {
        XMLReader reader = XMLReaderFactory.createXMLReader();
        Sax sax = new Sax();
        reader.setContentHandler(sax);
        reader.parse("src/main/java/Homework19/pointList.xml");
    }
}
