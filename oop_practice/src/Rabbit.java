class Rabbit extends Animal {  
    private double weight; 

    public Rabbit(String breed, String characteristics, String temperament, String color, double price, double weight) {  
        super(breed, characteristics, temperament, color, price);  
        this.weight = weight;  
    }  

    @Override  
    public String getInfo() {  
        return "Rabbit Breed: " + breed + ", Characteristics: " + characteristics +  
               ", Temperament: " + temperament + ", Color: " + color +   
               ", Price: $" + price + ", Weight: " + weight + "kg";  
    }

    public double getWeight() {
        return weight;
    }
}