package project1.src;

public class Interfaces {
    public static void main(String[] args) {

        Computer computer1 = new Computer();
        computer1.start();

        Vehicle vehicle1= new Vehicle("Car");
        vehicle1.drive();

        Information info = new Computer();
        // the reason is that Computer implements Information
        info.displayInfo();

        Information info1 = vehicle1; 
        // vehicle1 is a variable that points to an object which is of Vehicle class which implements Information interface
        info1.displayInfo();

        System.out.println();

        showInformation(info1);
        showInformation(computer1);
        showInformation(vehicle1);
    }
    private static void showInformation(Information info){
        info.displayInfo();
    }
    
}
