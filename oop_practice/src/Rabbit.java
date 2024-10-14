class Rabbit extends Animal {

    public Rabbit(String breed, String temperament, String characteristics, String color, double price) {
        super(breed, characteristics, temperament, color, price);
    }

    @Override
    public String getInfo() {
        return "Rabbit - " + super.getInfo();
    }

    @Override
    public void sound() {
        System.out.println("Фрр!");
    }
}
