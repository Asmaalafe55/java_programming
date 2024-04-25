package project1.src;

public class Computer implements Information{
    private int serialNumber = 8035;

    public void start(){
        System.out.println("Computer Started");
    }

    @Override
    public void displayInfo(){
        System.out.println("Computer serial Number : " + serialNumber);
    }
}
