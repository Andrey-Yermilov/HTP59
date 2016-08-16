package Homework19;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DOMParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        File f = new File("src/main/java/Homework19/pointList.xml");
        Document doc = builder.parse(f);
        Element root = doc.getDocumentElement();
        System.out.println(root.getTagName());
        NodeList nList = root.getElementsByTagName("point");
        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i) instanceof Element) {
                StringBuffer s = new StringBuffer(nList.item(i).getNodeName());
                String x = ((Element) nList.item(i)).getElementsByTagName("x").item(0).getTextContent();
                String y = ((Element) nList.item(i)).getElementsByTagName("y").item(0).getTextContent();
                String unit = ((Element) nList.item(i)).getElementsByTagName("unit").item(0).getTextContent();
                s.append(" ").append(i + 1).append(": ").append(x).append(unit).append(",").append(y).append(unit);
                System.out.println(s);
            }
        }
    }
}
