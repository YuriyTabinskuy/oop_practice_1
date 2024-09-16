class Dog extends Animal {  
    private String size; 

    public Dog(String breed, String characteristics, String temperament, String color, double price, String size) {  
        super(breed, characteristics, temperament, color, price);  
        this.size = size;  
    }  

    @Override  
    public String getInfo() {  
        return "Dog Breed: " + breed + ", Characteristics: " + characteristics +   
               ", Temperament: " + temperament + ", Color: " + color +   
               ", Price: $" + price + ", Size: " + size;  
    }

    public String getSize() {
        return size;
    }
}