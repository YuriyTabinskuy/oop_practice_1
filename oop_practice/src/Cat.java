class Cat {
    private String breed;
    private String temperament;
    private String traits;
    private String color;
    private int price;

    public Cat(String breed, String temperament, String traits, String color, int price) {
        this.breed = breed;
        this.temperament = temperament;
        this.traits = traits;
        this.color = color;
        this.price = price;
    }

    public String getInfo() {
        return "Breed: " + breed + "\nTemperament: " + temperament + "\nTraits: " + traits + "\nColor: " + color + "\nPrice: $" + price;
    }
}