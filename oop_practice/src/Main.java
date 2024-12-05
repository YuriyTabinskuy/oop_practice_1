import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = Arrays.asList(
            new Cat("Persian", "Fluffy and friendly", "Calm and loving", "White", 1000, getRandomAge()),
            new Cat("Siamese", "Elegant and talkative", "Affectionate and vocal", "Cream", 800, getRandomAge()),
            new Cat("Maine Coon", "Large and playful", "Gentle and intelligent", "Brown", 1200, getRandomAge()),
            new Cat("Bengal", "Spotted and energetic", "Playful and active", "Golden", 1500, getRandomAge()),
            new Cat("Siberian", "Thick coat and friendly", "Loyal and calm", "Gray", 1100, getRandomAge()),

            new Dog("Golden Retriever", "Loyal and intelligent", "Friendly and playful", "Golden", 1500, getRandomAge()),
            new Dog("Labrador", "Energetic and smart", "Friendly and outgoing", "Black", 1400, getRandomAge()),
            new Dog("German Shepherd", "Protective and loyal", "Brave and smart", "Brown and black", 1800, getRandomAge()),
            new Dog("Bulldog", "Calm and strong", "Friendly and gentle", "White", 1200, getRandomAge()),
            new Dog("Poodle", "Intelligent and trainable", "Energetic and loving", "White", 1600, getRandomAge()),

            new Rabbit("Dutch", "Small and cute", "Gentle and curious", "Brown and white", 500, getRandomAge()),
            new Rabbit("Lionhead", "Fluffy mane", "Gentle and friendly", "Gray", 600, getRandomAge()),
            new Rabbit("Mini Lop", "Compact and sweet", "Affectionate and playful", "White", 700, getRandomAge()),
            new Rabbit("Flemish Giant", "Large and calm", "Gentle and laid-back", "Brown", 800, getRandomAge()),
            new Rabbit("Rex", "Velvety fur", "Playful and curious", "Black", 550, getRandomAge())
        );

       // Виведення оригінального списку
       System.out.println("Original List:");
       animals.forEach(animal -> System.out.println(animal.getInfo()));

       // Сортування за ціною (від найдорожчого до найдешевшого)
       animals.sort(Comparator.comparingDouble(Animal::getPrice).reversed());
       System.out.println("Sorted by Price (Descending):");
       animals.forEach(animal -> System.out.println(animal.getInfo()));

       // Сортування за ціною (від найдешевшого до найдорожчого)
       animals.sort(Comparator.comparingDouble(Animal::getPrice));
       System.out.println("Sorted by Price (Ascending):");
       animals.forEach(animal -> System.out.println(animal.getInfo()));

       // Сортування за віком (найстарші спочатку), а потім по алфавіту
       animals.sort(Comparator.comparingInt(Animal::getAge).reversed().thenComparing(Animal::getBreed));
       System.out.println("Sorted by Age (Descending) and Breed:");
       animals.forEach(animal -> System.out.println(animal.getInfo()));

       // Сортування за алфавітом, а потім за віком (зростання)
       animals.sort(Comparator.comparing(Animal::getBreed).thenComparingInt(Animal::getAge));
       System.out.println("Sorted by Breed and Age (Ascending):");
       animals.forEach(animal -> System.out.println(animal.getInfo()));


       try {
           checkAgeLimit(animals.get(0)); 
       } catch (AnimalAgeException e) {
           System.out.println("" + e.getMessage());
       }


       System.out.println("Interacting with the pets:");
       animals.forEach(animal -> {
           if (animal instanceof Pet) {
               Pet pet = (Pet) animal;
               pet.feed();
               pet.groom();
           }
       });
   }


   private static int getRandomAge() {
       return (int) (1 + Math.random() * 10); 
   }

 
   public static void checkAgeLimit(Animal animal) throws AnimalAgeException {
       if (animal.getAge() > 20) {
           throw new AnimalAgeException("Age of the animal exceeds the limit: " + animal.getBreed());
       }
   }
}