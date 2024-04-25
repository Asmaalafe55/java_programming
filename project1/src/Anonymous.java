package project1.src;

class Computer1 {
    public void shutDown(){
        System.out.println("Computer is shutting down");
    }
}

interface Phone{
    public void call();
}

public class Anonymous {
    public static void main(String[] args) {
        // They enable you to declare and instantiate a class at the same time. 
        // They are like local classes except that they do not have a name. 
        // Use them if you need to use a local class only once.

        Computer1 computer1 = new Computer1() {
            // here we can override the method of Computer1 class
            @Override
            public void shutDown(){
                System.out.println("MacBook is Shutting down");
            }
        };
        computer1.shutDown();

        Phone phone1 = new Phone() {
            @Override
            public void call(){
                System.out.println("Phone is calling ...");
            }
        };

        phone1.call();
    }
}
