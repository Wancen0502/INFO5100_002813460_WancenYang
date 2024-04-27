import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLparse {

    public XMLparse(String pathname){
        try {
            File inputFile = new File(pathname);
            DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("Book");
            System.out.println("---------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Book ISBN : "
                            + eElement.getAttribute("ISBN"));
                    System.out.println("Title: "
                            + eElement
                            .getElementsByTagName("title")
                            .item(0)
                            .getTextContent());
                    System.out.println("Published Year: "
                            + eElement
                            .getElementsByTagName("publishedYear")
                            .item(0)
                            .getTextContent());
                    System.out.println("Number of Pages: "
                            + eElement
                            .getElementsByTagName("numberOfPages")
                            .item(0)
                            .getTextContent());
                    NodeList authorsList = eElement.getElementsByTagName("value");
                    System.out.println("Authors: ");
                    for (int i = 0; i < authorsList.getLength(); i++) {
                        Node authorNode = authorsList.item(i);
                        if (authorNode.getNodeType() == Node.ELEMENT_NODE) {
                            System.out.println(authorNode.getTextContent());
                        }
                    }
                    System.out.println();

                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
