package homework15;

public final class Cat {
    private final String colorEyes;
    private final String breed;

    public  Cat(String colorEyes, String breed) {
        this.colorEyes = colorEyes;
        this.breed = breed;
    }

    public Cat changeColor(String color){
        return new Cat (color,this.breed);
    }

    public Cat changeBreed(String breed){
        return new Cat (this.colorEyes,breed);
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "bread: " + getBreed() + ", colour: " + getColorEyes();
    }

}
