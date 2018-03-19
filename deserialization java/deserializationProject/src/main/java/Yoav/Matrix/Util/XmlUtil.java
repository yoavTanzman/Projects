package Yoav.Matrix.Util;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlUtil {
	
	public static void printXml(String fileName)
	{
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(fileName);
			NodeList personlist=doc.getElementsByTagName("person");
			for (int i = 0; i < personlist.getLength(); i++) {
				Node n=personlist.item(i);
				if(n.getNodeType()==Node.ELEMENT_NODE)
				{
					Element person = (Element)n;
					String id = person.getAttribute("id");
					NodeList nameList = person.getChildNodes();
					for (int j = 0; j < nameList.getLength(); j++) {
						Node p = nameList.item(j);
						if(p.getNodeType()== Node.ELEMENT_NODE)
						{
							Element name = (Element) p;
							System.out.println("Person "+ id + ": "+ name.getTagName()+" = "+name.getTextContent());
							
						}
						
					}
					
				}
				System.out.println();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
