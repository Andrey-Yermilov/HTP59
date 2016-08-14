package Classwork;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XMTToHTMLTransformer {
    public static void main(String[] args) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer(new StreamSource("src/main/java/Classwork/template.xsl"));
        transformer.transform(new StreamSource("src/main/java/Classwork/pointlist.xml"),new StreamResult("src/main/java/Classwork/1.html"));
    }
}
