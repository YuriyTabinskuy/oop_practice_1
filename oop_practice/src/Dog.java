class Dog {  
    private String breed;  
    private String characteristics;  
    private String temperament;  
    private String color;  
    private double price;  

    public Dog(String breed, String characteristics, String temperament, String color, double price) {  
        this.breed = breed;  
        this.characteristics = characteristics;  
        this.temperament = temperament;  
        this.color = color;  
        this.price = price;  
    }  

    public String getInfo() {  
        return "Dog Breed: " + breed + ", Characteristics: " + characteristics +   
               ", Temperament: " + temperament + ", Color: " + color +   
               ", Price: $" + price;  
    }  
}  
