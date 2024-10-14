class Animal {
    private String breed;
    private String characteristics;
    private String temperament;
    private String color;
    private double price;

    public Animal(String breed, String characteristics, String temperament, String color, double price) {
        this.breed = breed;
        this.characteristics = characteristics;
        this.temperament = temperament;
        this.color = color;
        this.price = price;
    }

    public String getBreed() {
        return breed;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public String getTemperament() {
        return temperament;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getInfo() {
        return "Breed: " + breed + ", Characteristics: " + characteristics + 
               ", Temperament: " + temperament + ", Color: " + color + 
               ", Price: $" + price;
    }

    public void sound() {
        System.out.println("Animal sound");
    }
}
