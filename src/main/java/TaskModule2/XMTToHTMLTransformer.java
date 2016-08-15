package TaskModule2;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMTToHTMLTransformer {
    public static void main(String[] args) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(new StreamSource("src/main/java/TaskModule2/template.xsl"));
        transformer.transform(new StreamSource("src/main/java/TaskModule2/plants.xml"),new StreamResult("src/main/java/TaskModule2/result.html"));
    }
}

