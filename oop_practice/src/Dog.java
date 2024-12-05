class Dog extends Animal implements Pet {
    public Dog(String breed, String characteristics, String temperament, String color, double price, int age) {
        super(breed, characteristics, temperament, color, price, age);
    }

    @Override
    public void sound() {
        System.out.println("Woof!");
    }

    @Override
    public String getInfo() {
        return "Dog - " + getBreed() + ", Age: " + getAge() + ", Color: " + getColor() + ", Price: $" + getPrice();
    }

    @Override
    public void feed() {
        System.out.println("Feeding the dog with premium dog food.");
    }

    @Override
    public void groom() {
        System.out.println("Brushing the dog's coat and clipping nails.");
    }
}