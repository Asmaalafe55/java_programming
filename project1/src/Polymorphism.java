package project1.src;

public class Polymorphism {

    public static void main(String[] args) {

        Person person1 = new Person();
        Scholar scholar1 = new Scholar();

        // Person person2 = person1;
        // person2.eyes(); // This calls the eyes() method from Person class

        Person person2 = scholar1; // points to student object
        person2.eyes();
        // ((Student) person3).eyes(); // Cast person3 back to Student to access eyes() method
    }
}
