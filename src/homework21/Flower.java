package homework21;

public class Flower {
    private String name, soil, origin,colorStalk,colorLeaves,middleSize,temperature,lighting,watering,multiplying;

    public Flower(String name, String soil, String origin, String colorStalk, String colorLeaves, String middleSize,
                  String temperature, String lighting, String watering, String multiplying) {
        this.name = name;
        this.soil = soil;
        this.origin = origin;
        this.colorStalk = colorStalk;
        this.colorLeaves = colorLeaves;
        this.middleSize = middleSize;
        this.temperature = temperature;
        this.lighting = lighting;
        this.watering = watering;
        this.multiplying = multiplying;
    }

    public String getOrigin() {
        return origin;
    }


    @Override
    public String toString() {
        return "name: " + name + "\n" + "soil: " + soil +
                "\n" + "original: " + origin + "\n" + "colorStalk: " + colorStalk +
                "\n" + "colorLeaves: " + colorLeaves + "\n" + "middleSize: " +
                middleSize + "\n" + "temperature: " + temperature + "\n" +
                "lighting: " + lighting + "\n" + "watering: " + watering + "\n" +
                "multiplying: " + multiplying;
    }
}
