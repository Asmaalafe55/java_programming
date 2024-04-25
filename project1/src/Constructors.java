package project1.src;

class Program {
    int value;
    String text;
    
    // A constructor used to initialize the instance variables with the default 
    // values is called a default constructor. 
    // A constructor that contains no parameter is known as the default constructor.
    // The compiler creates a default constructor for the class if we do not do it
    //  by ourselves
    public Program (){ // constructor
        this(5); // this will call the second constructor 
        // this must be the first line 
        value =12;
        System.out.println("First constructure");
    }
    public Program (int value){ // constructor
        this.value = value;
        System.out.println("Second constructure");
    }
    public Program (int value, String text){ // constructor
        this(); // it will call the first constructor
        this.value = value;
        this.text = text;
        System.out.println("Third constructure");

    }

}

public class Constructors {
    public static void main(String[] args) {
        Program myProgram = new Program();
        Program myProgram1 = new Program(2);
        Program myProgram2 = new Program(9,"Hello");
        
    }
    
}
