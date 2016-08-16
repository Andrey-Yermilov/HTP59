package Homework19;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class STAXParser {
    public static void main(String[] args) {
        int pointNumber = 0;
        Point p = null;
        boolean isX = false;
        boolean isY = false;
        boolean isUnit = false;
        try {
            XMLStreamReader reader = XMLInputFactory.newFactory()
                    .createXMLStreamReader(new FileInputStream("src/main/java/Homework19/pointList.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == XMLStreamConstants.START_ELEMENT) {
                    if (reader.getLocalName().equals("pointList")) {
                        System.out.println(reader.getLocalName());
                    } else if (reader.getLocalName().equals("point")) {
                        pointNumber++;
                        System.out.print(reader.getLocalName() + pointNumber + ": ");
                        p = new Point();
                    } else if (reader.getLocalName().equals("x")) {
                        isX = true;
                    } else if (reader.getLocalName().equals("y")) {
                        isY = true;
                    } else if (reader.getLocalName().equals("unit")) {
                        isUnit = true;
                    }
                } else if (res == XMLStreamConstants.CHARACTERS) {
                    if (isX) {
                        p.setX(Integer.parseInt(reader.getText()));
                        isX = false;
                    }
                    if (isY) {
                        p.setY(Integer.parseInt(reader.getText()));
                        isY = false;
                    }
                    if (isUnit) {
                        p.setUnit(reader.getText());
                        isUnit = false;
                    }
                }
                if (p != null && p.getUnit() != null) {
                    System.out.println(p.getX() + p.getUnit() + "," + p.getY() + p.getUnit());
                    p = null;
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
