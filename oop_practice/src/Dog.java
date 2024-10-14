class Dog extends Animal {

    public Dog(String breed, String temperament, String characteristics, String color, double price) {
        super(breed, characteristics, temperament, color, price);
    }

    @Override
    public String getInfo() {
        return "Dog - " + super.getInfo();
    }

    @Override
    public void sound() {
        System.out.println("Гав!");
    }
}
