package homework21;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class XmlHandler extends DefaultHandler {
    public static ArrayList<Flower> listOfFlower = new ArrayList<>();
    private String name, soil, origin, multiplying,colorStalk,colorLeaves,lighting, middleSize, temperature,watering,element;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        element = qName;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String information = new String(ch, start, length);
        information = information.replace("\n", "").trim();

        if (!information.isEmpty()&&!information.equals("visualParameters") && !information.equals("growingTips")) {
            if (element.equals("name"))
                name = information;
            if (element.equals("soil"))
                soil = information;
            if(element.equals("origin"))
                origin=information;
            if (element.equals("colorStalk"))
                colorStalk=information;
            if(element.equals("colorLeaves"))
                colorLeaves=information;
            if(element.equals("middleSize"))
                middleSize=information;
            if(element.equals("temperature"))
                temperature=information;
            if(element.equals("lighting"))
                lighting=information;
            if(element.equals("watering"))
                watering=information;
            if(element.equals("multiplying"))
                multiplying=information;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ( (name != null && !name.isEmpty()) && (soil != null && !soil.isEmpty()) &&
                (origin != null && !origin.isEmpty()) && (colorStalk != null && !colorStalk.isEmpty()) &&
                (colorLeaves != null && !colorLeaves.isEmpty()) && (middleSize != null && !middleSize.isEmpty()) &&
                (temperature != null && !temperature.isEmpty()) && (lighting != null && !lighting.isEmpty()) &&
                (watering != null && !watering.isEmpty()) && (multiplying != null && !multiplying.isEmpty()) ) {

            listOfFlower.add(new Flower(name, soil,origin,colorStalk,colorLeaves,middleSize,temperature,
                    lighting,watering,multiplying));


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
}
