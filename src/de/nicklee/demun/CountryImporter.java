package de.nicklee.demun;

/**
 * Created by Nick Lee on 31/12/14 at 18:48.
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.codehaus.plexus.util.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class CountryImporter {
    public static void main(String argv[]) {

        try {
            String countryListURI = CountryImporter.class.getResource("/de/nicklee/demun/resources/countries.xml").toURI().toString();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(countryListURI);

            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("country");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("Short Name : " + eElement.getElementsByTagName("shortname").item(0).getTextContent());
                    System.out.println("Long Name : " + eElement.getElementsByTagName("longname").item(0).getTextContent());
                    System.out.println("FlagID : " + eElement.getElementsByTagName("flagname").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
