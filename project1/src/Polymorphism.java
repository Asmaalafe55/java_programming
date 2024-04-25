package project1.src;

public class Polymorphism {

    public static void main(String[] args) {

        Person person1 = new Person();
        Scholar scholar1 = new Scholar();

        Person person2 = person1;
        person2.eyes(); // This calls the eyes() method from Person class

        Person person3 = scholar1; // points to student object
        person3.eyes(); // person3 will access eyes() method of the subclass

        scholar1.hair();
        // person3.hair(); // this cause an error

        addSomeone(scholar1); // even when addSomeone expects Person object, we can pass to it anything of type Person like Scholar

    }

    public static void addSomeone(Person person){
        person.eyes();
    }

}
