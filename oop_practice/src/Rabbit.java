class Rabbit extends Animal implements Pet {
    public Rabbit(String breed, String characteristics, String temperament, String color, double price, int age) {
        super(breed, characteristics, temperament, color, price, age);
    }

    @Override
    public void sound() {
        System.out.println("Sniff!");
    }

    @Override
    public String getInfo() {
        return "Rabbit - " + getBreed() + ", Age: " + getAge() + ", Color: " + getColor() + ", Price: $" + getPrice();
    }

    @Override
    public void feed() {
        System.out.println("Feeding the rabbit with fresh vegetables.");
    }

    @Override
    public void groom() {
        System.out.println("Grooming the rabbit's fur gently.");
    }
}