import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
         Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Оберіть категорію: ");
            System.out.println("1. Cats");
            System.out.println("2. Dogs");
            System.out.println("3. Rabbits");
            System.out.println("0. Вийти");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    printCats();
                    break;
                case 2:
                    printDogs();
                    break;
                case 3:
                   printRabbits();
                    break;
                case 0:
                    System.out.println("Програма завершує роботу.");
                    break;
                default:
                    System.out.println("Неправильний вибір.");
            }
        } while (choice != 0);

        scanner.close();
    }
    public static void printCats() {
        Cat[] cats = {  
            new Cat("British Shorthair", "Calm, easygoing", "Loyal and playful", "Blue", 1200),  
            new Cat("Sphynx", "Hairless breed", "Affectionate and energetic", "Nude", 1500),  
            new Cat("Ragdoll", "Large, fluffy", "Gentle and friendly", "Blue point", 1800),  
            new Cat("Scottish Fold", "Unique folded ears", "Adaptable and social", "Cream", 1300)  
        };  
    
        for (Cat cat : cats) {  
            System.out.println(cat.getInfo());  
            System.out.println();  
        }  
    }  
    
    public static void printDogs() {  
        Dog[] dogs = {  
            new Dog("Labrador Retriever", "Friendly, outgoing", "Great with kids", "Black", 1000),  
            new Dog("Poodle", "Intelligent, adaptable", "Hypoallergenic fur", "White", 1200),  
            new Dog("Beagle", "Curious and merry", "Great family dog", "Tricolor", 800),  
            new Dog("Bulldog", "Gentle and courageous", "Good with children", "Fawn", 1300)  
        };  
    
        for (Dog dog : dogs) {  
            System.out.println(dog.getInfo());  
            System.out.println();  
        }  
    }  
    
    public static void printRabbits() {  
        Rabbit[] rabbits = {  
            new Rabbit("Holland Lop", "Friendly and affectionate", "Playful and energetic", "Various colors", 50),  
            new Rabbit("Netherland Dwarf", "Small and gentle", "Curious and social", "Various colors", 60),  
            new Rabbit("Mini Rex", "Soft, velvety fur", "Calm and friendly", "Black and white", 70),  
            new Rabbit("English Angora", "Long, fluffy fur", "Quiet and sweet", "White", 80)  
        };  
    
        for (Rabbit rabbit : rabbits) {  
            System.out.println(rabbit.getInfo());  
            System.out.println();  
        }  
    }
    }

