class Cat extends Animal {  

    public Cat(String breed, String characteristics, String temperament, String color, double price) {  
        super(breed, characteristics, temperament, color, price);  
    }  

    @Override  
    public String getInfo() {  
        return "Cat Breed: " + breed + ", Characteristics: " + characteristics +  
               ", Temperament: " + temperament + ", Color: " + color +  
               ", Price: $" + price;  
    }  
}  
