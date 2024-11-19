public class Student {  
    String name;  
    int id;  

    public Student(String name, int id) {  
        this.name = name;  
        this.id = id;  
    }  
}  

public class HashSetCustomClass {  
    public static void main(String[] args) {  
        HashSet<Student> students = new HashSet<>();  

        students.add(new Student( name: "Іван", id: 1));  
        students.add(new Student( name: "Марія", id: 2));  
        students.add(new Student( name: "Іван", id: 1));  

        System.out.println("Кількість студентів: " + students.size());  
    }  
}