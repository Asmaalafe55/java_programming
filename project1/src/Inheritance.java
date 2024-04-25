package project1.src;

public class Inheritance {
    public static void main(String[] args) {

        // access modifiers : public, protected, default (lack of access modifier), private

        Factory factory1 = new Factory();

        factory1.design();
        factory1.build();

        Car car1 = new Car();

        Factory factory2 = car1;
        factory2.build();



        car1.design();
        car1.build();
        // car1.brand();
    }
}