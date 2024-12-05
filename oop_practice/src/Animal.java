abstract class Animal  {
    private String breed;
    private String characteristics;
    private String temperament;
    private String color;
    private double price;
    private int age;

    public Animal(String breed, String characteristics, String temperament, String color, double price, int age) {
        this.breed = breed;
        this.characteristics = characteristics;
        this.temperament = temperament;
        this.color = color;
        this.price = price;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public abstract void sound();

    public abstract String getInfo();
}



