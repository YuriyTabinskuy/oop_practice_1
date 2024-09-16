class Cat extends Animal {  
    private String furType; 

    public Cat(String breed, String characteristics, String temperament, String color, double price, String furType) {  
        super(breed, characteristics, temperament, color, price);  
        this.furType = furType;  
    }  

    @Override  
    public String getInfo() {  
        return "Cat Breed: " + breed + ", Characteristics: " + characteristics +  
               ", Temperament: " + temperament + ", Color: " + color +  
               ", Price: $" + price + ", Fur Type: " + furType;  
    }

    public String getFurType() {
        return furType;
    }
}