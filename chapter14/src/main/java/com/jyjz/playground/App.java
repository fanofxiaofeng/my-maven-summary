package com.jyjz.playground;


import org.apache.commons.configuration.XMLConfiguration;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Heelo");
        XMLConfiguration configuration = new XMLConfiguration("conf.xml");
        String username = configuration.getString("database-username");
        System.out.println(username);

        File file = new File("src/main/resources/conf.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);
        System.out.println(document.getDocumentElement().getNodeName());
    }
}
