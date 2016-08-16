package Homework19;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {
    private String thisElement;
    private Point p;
    private int pointNumber;

    @Override
    public void startElement(String uri, String localName, String qName,
                             Attributes attrs) throws SAXException {

        thisElement = qName;
        if (thisElement.equals("pointList")) {
            System.out.println(thisElement);
        }
        if (thisElement.equals("point")) {
            p = new Point();
            pointNumber++;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        thisElement = qName;
        if (thisElement.equals("point")) {
            System.out.println(thisElement + " " + pointNumber + ": " + p.getX() + p.getUnit() + "," + p.getY() + p.getUnit());

        }
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (thisElement.equals("x")) {
            int x = Integer.parseInt(new String(ch, start, length));
            p.setX(x);
        }
        if (thisElement.equals("y")) {
            int y = Integer.parseInt(new String(ch, start, length));
            p.setY(y);
        }
        if (thisElement.equals("unit")) {
            String unit = new String(ch, start, length);
            p.setUnit(unit);
        }
    }
}