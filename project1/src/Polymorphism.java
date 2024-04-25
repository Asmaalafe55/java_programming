package project1.src;

public class Polymorphism {
    public static void main(String[] args) {
        Person person1 = new Person();
        Student student1 = new Student();

        Person person2 = person1;
        person2.eyes(); // This calls the eyes() method from Person class

        Person person3 = student1; // points to student object
        // person3.eyes();
        ((Student) person3).eyes(); // Cast person3 back to Student to access eyes() method
    }
}
