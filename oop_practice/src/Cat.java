class Cat extends Animal {

    public Cat(String breed, String temperament, String characteristics, String color, double price) {
        super(breed, characteristics, temperament, color, price);
    }

    @Override
    public String getInfo() {
        return "Cat - " + super.getInfo();
    }

    @Override
    public void sound() {
        System.out.println("Мяу!");
    }
}
