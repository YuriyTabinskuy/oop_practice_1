class Animal {  
    String breed;  
    String characteristics;  
    String temperament;  
    String color;  
    double price;  

    public Animal(String breed, String characteristics, String temperament, String color, double price) {  
        this.breed = breed;  
        this.characteristics = characteristics;  
        this.temperament = temperament;  
        this.color = color;  
        this.price = price;  
    }  

    public String getInfo() {  
        return "Animal Breed: " + breed + ", Characteristics: " + characteristics +  
               ", Temperament: " + temperament + ", Color: " + color +  
               ", Price: $" + price;  
    }  
}  