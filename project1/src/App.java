package project1.src;

class Student {

    public static final int MY_CONSTANT = 8; // this cant be changed in any other place in the code

    public String name;
    public static String studentClass; // known as class variables
    public static int count=0;

    public Student (){
        count++;
    }
    
    public void studentName(){
        System.out.println(name);
        // non static methods can access static data
    }

    public static void classInfo(){
        System.out.println("Java");
        // static methods can access static variables but it cant access instance variables
    }

}

public class App {
    public static void main(String[] args) {

        System.out.println("Before creating objects: " + Student.count);

        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("After creating objects: " + Student.count);

        student1.name = "Asma";
        student2.name = "Saeed";

        System.out.println(student1.name);
        System.out.println(student2.name);

        // here : every student object gets its own copy

        Student.studentClass = "Web development";
        System.out.println(Student.studentClass);

        // but here : every student object does not get its own copy

        student1.studentName();
        student2.studentName();

        // here : calling the methods for each object

        Student.classInfo();

        // but here : calling the method by the main object

        System.out.println(Student.MY_CONSTANT);
        // This gives an error!  Student.MY_CONSTANT = 9; 
    }
}
