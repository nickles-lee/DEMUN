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
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CountryImporter {
    public static void main(String argv[]) {
        List<Country> countryList = importDefaultCountryXML();
        for(Country i : countryList){
            System.out.println(i);
        }

    }

    public static List<Country> importDefaultCountryXML(){
        ArrayList<Country> returnList = new ArrayList<Country>();

        try {
            String countryListURI = CountryImporter.class.getResource("/de/nicklee/demun/resources/countries.xml").toURI().toString();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(countryListURI);

            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("country");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    returnList.add(new Country(
                            eElement.getElementsByTagName("shortname").item(0).getTextContent(),
                            eElement.getElementsByTagName("longname").item(0).getTextContent(),
                            eElement.getElementsByTagName("flagname").item(0).getTextContent()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnList;

    }

    public static List<Country> importCustomCountryXML(){
        return new ArrayList<Country>();
    }
}
