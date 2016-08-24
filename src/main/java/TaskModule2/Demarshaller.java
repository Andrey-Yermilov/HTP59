package TaskModule2;

import TaskModule2.generated.Flowers;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileReader;
import java.io.IOException;

public class Demarshaller {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, JAXBException {
        JAXBContext jc = JAXBContext.newInstance(Flowers.class);
        Unmarshaller u = jc.createUnmarshaller();
        FileReader reader = new FileReader("src/main/java/TaskModule2/plants.xml");
        Flowers flowers = (Flowers) u.unmarshal(reader);
        System.out.println("Created objects:");
        System.out.println(flowers);
    }
}
