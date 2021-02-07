package homework21;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;

public class StaxExample {
    public static void main(String[] args) {
        final String fileName ="src/homework21/flowers.xml";
        ArrayList<Flower> listOfFlower = new ArrayList<>();
        String name = null, soil = null, origin = null, multiplying = null,colorStalk = null,colorLeaves = null,
                lighting = null, middleSize = null, temperature = null,watering = null,element = null;
        try{
            XMLStreamReader xml = XMLInputFactory.newInstance().createXMLStreamReader(fileName,new FileInputStream(fileName));
            while(xml.hasNext()){
                xml.next();
                if(xml.isStartElement()){
                    element=xml.getLocalName();
                }
                else if (xml.hasText()&&xml.getText().trim().length()>0){ //содержимое тега

                    if("name".equals(element)){name=xml.getText().replace("\n","").trim();}
                    if("soil".equals(element)){soil=xml.getText().replace("\n","").trim();}
                    if("origin".equals(element)){origin=xml.getText().replace("\n","").trim();}
                    if("multiplying".equals(element)){multiplying=xml.getText().replace("\n","").trim();}
                    if("colorStalk".equals(element)){colorStalk=xml.getText().replace("\n","").trim();}
                    if("colorLeaves".equals(element)){colorLeaves=xml.getText().replace("\n","").trim();}
                    if("lighting".equals(element)){lighting=xml.getText().replace("\n","").trim();}
                    if("middleSize".equals(element)){middleSize=xml.getText().replace("\n","").trim();}
                    if("temperature".equals(element)){temperature=xml.getText().replace("\n","").trim();}
                    if("watering".equals(element)){watering=xml.getText().replace("\n","").trim();}

                }
                else if (xml.isEndElement()){
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
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found" + e);
        }catch(XMLStreamException e){
            System.err.println("Stax parsing error! " + e.getMessage());
        }
        listOfFlower.stream().sorted(Comparator.comparing(Flower::getOrigin)).forEach(System.out::println);
    }
}
