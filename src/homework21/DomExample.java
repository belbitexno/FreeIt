package homework21;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import org.w3c.dom.Node;
//Парсим xml fail с помощью DOM

public class DomExample {
    public static void main(String[] args) {
        String name=null, soil=null, origin=null, multiplying=null,colorStalk=null,colorLeaves=null,lighting=null,
                middleSize=null, temperature=null,watering=null;
        ArrayList<Flower> listOfFlower = new ArrayList<>();
        final String fileName = "src/homework21/flowers.xml";
        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse(fileName);
            Node root = document.getDocumentElement();
            NodeList flowerElement = root.getChildNodes();//list flowers
            for (int i = 0; i < flowerElement.getLength(); i++) {
                Node flower = flowerElement.item(i);//take flower
                if (flower.getNodeType() != Node.TEXT_NODE) {
                    NodeList flowerProps = flower.getChildNodes();// take flower's list of element
                    for (int j = 0; j < flowerProps.getLength(); j++) {
                        Node flowerProp = flowerProps.item(j);//take flower's element: name,soil...
                        if(flowerProp.getNodeName().equals("visualParameters")){
                            NodeList visualParameters = flowerProp.getChildNodes();
                            for(int b = 0;b<visualParameters.getLength();b++){
                                Node elementVis = visualParameters.item(b); // take visualParameters elements
                                if (elementVis.getNodeType() != Node.TEXT_NODE) {
                                    if(elementVis.getNodeName().equals("colorStalk")){colorStalk=elementVis.getChildNodes().item(0).getTextContent();}
                                    if(elementVis.getNodeName().equals("colorLeaves")){colorLeaves=elementVis.getChildNodes().item(0).getTextContent();}
                                    if(elementVis.getNodeName().equals("middleSize")){middleSize=elementVis.getChildNodes().item(0).getTextContent();}
                                }
                            }
                        }
                        else if(flowerProp.getNodeName().equals("growingTips")){
                            NodeList growingTipsParameters = flowerProp.getChildNodes();
                            for(int b = 0;b<growingTipsParameters.getLength();b++){
                                Node elementGrow = growingTipsParameters.item(b); //take growingTips elements
                                if (elementGrow.getNodeType() != Node.TEXT_NODE) {
                                    if(elementGrow.getNodeName().equals("temperature")){temperature=elementGrow.getChildNodes().item(0).getTextContent();}
                                    if(elementGrow.getNodeName().equals("lighting")){lighting=elementGrow.getChildNodes().item(0).getTextContent();}
                                    if(elementGrow.getNodeName().equals("watering")){watering=elementGrow.getChildNodes().item(0).getTextContent();}

                                }
                            }
                        }
                        else if (flowerProp.getNodeType() != Node.TEXT_NODE) {
                            if(flowerProp.getNodeName().equals("name")){name=flowerProp.getChildNodes().item(0).getTextContent();}
                            if(flowerProp.getNodeName().equals("soil")){soil=flowerProp.getChildNodes().item(0).getTextContent();}
                            if(flowerProp.getNodeName().equals("origin")){origin=flowerProp.getChildNodes().item(0).getTextContent();}
                            if(flowerProp.getNodeName().equals("multiplying")){multiplying=flowerProp.getChildNodes().item(0).getTextContent();}
                        }
                    }
                }
                if ( (name != null && !name.isEmpty()) && (soil != null && !soil.isEmpty()) &&
                        (origin != null && !origin.isEmpty()) && (colorStalk != null && !colorStalk.isEmpty()) &&
                        (colorLeaves != null && !colorLeaves.isEmpty()) && (middleSize != null && !middleSize.isEmpty()) &&
                        (temperature != null && !temperature.isEmpty()) && (lighting != null && !lighting.isEmpty()) &&
                        (watering != null && !watering.isEmpty()) && (multiplying != null && !multiplying.isEmpty()) ) {

                    listOfFlower.add(new Flower(name, soil, origin, colorStalk, colorLeaves, middleSize, temperature,
                            lighting, watering, multiplying));
                    name = null;
                    soil = null;
                    origin = null;
                    colorStalk = null;
                    colorLeaves = null;
                    middleSize = null;
                    temperature = null;
                    lighting = null;
                    watering = null;
                    multiplying = null;
                }
            }
        } catch (ParserConfigurationException e) {
            System.err.print(fileName + " config error: " + e.getMessage());
        }catch (SAXException e){
            System.err.print("ошибка Sax парсера: " + e);
        }catch (IOException e){
            System.err.print("ошибка i/o потока: " + e);
        }

        listOfFlower.stream().sorted(Comparator.comparing(Flower::getOrigin)).forEach(System.out::println);
    }
}

