class Cat extends Animal implements Pet, example {
    public Cat(String breed, String characteristics, String temperament, String color, double price, int age) {
        super(breed, characteristics, temperament, color, price, age);
    }

    @Override
    public void sound() {
        System.out.println("Meow!");
    }

    @Override
    public String getInfo() {
        return "Cat - " + getBreed() + ", Age: " + getAge() + ", Color: " + getColor() + ", Price: $" + getPrice();
    }

    @Override
    public void feed() {
        System.out.println("Feeding the cat with high-quality cat food.");
    }

    @Override
    public void groom() {
        System.out.println("Brushing the cat's fur and cleaning the litter box.");
    }
}