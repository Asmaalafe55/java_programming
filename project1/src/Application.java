package project1.src;

import java.util.Scanner;

class Methods{
    String animal;
    int value;
    int month;

    void run(){
        System.out.println("Running ... ");
        for(int i=0;i<4;i++){
            System.out.println("My" + animal + " is" + value + " years old");
    }
    } // we cant return anything in this void method

    int calculateMonthsToBirthday(){
        int monthsLeft = 12 - month;
        return monthsLeft;
    }

    void talk(String text){
        System.out.println(text);
    }
    void walk(int speed){
        System.out.println("Walking " + speed + "Km per hour");
    }
}

public class Application {
public static void main(String[] args) {
    int aNumber = 9;
    boolean flag = true;
    char a;
    byte b; 
    short c;
    String blank = " ";
    String moreText = "there";

    ///////////////////////////////////////////

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a text");
    String text = input.nextLine();
    System.out.println("The text you entered: " + text);
    System.out.println("Enter a double");
    double dNumber = input.nextDouble();
    System.out.println("The number you entered: " + dNumber);


    ///////////////////////////////////////////

    int bNumber =0;
    do{
        System.out.println("Hola ... enter 9");
        bNumber = input.nextInt();

    } while(bNumber!=9);
    System.out.println("You got 9");


    /////////////////////////////////////////

    System.out.println("Hola ... enter int");
    int intNumber = input.nextInt();
    // Variable types for switch statments: char, byte, short, int, String
    switch(intNumber){
        case 2:
        System.out.println("You got 2");
        break;
        case 3:
        System.out.println("You got 3");
        break;
        case 4:
        System.out.println("You got 4");
        break;
        default:
        System.out.println("Not expected!");
        

    }

    /////////////////////////////////////////

    int number =10;
    int[] numbers = new int[5]; // the array will contain 5 numbers
    System.out.println(numbers[0]);
    numbers[0]=15;
    System.out.println(numbers[0]);

    for (int i=0; i<numbers.length;i++){
        System.out.println(numbers[i]);
        
    }

    /////////////////////////////////////////

    int[] oneDimensionalArray = {12,49,922};
    System.out.println(oneDimensionalArray[1]);

    int[][] multiDimensionalArray = {{12,49,922},{12,44,2},{15,60,62}};
    System.out.println(multiDimensionalArray[1][2]);

    for (int i=0; i<multiDimensionalArray.length;i++){
        for (int j=0; j<multiDimensionalArray[i].length;j++){
            System.out.print(multiDimensionalArray[i][j]+ "\t");
        }
        System.out.println("\t");

    }

    /////////////////////////////////////////

    Methods name = new Methods();
    name.animal = "Cat";
    name.value = 9;
    name.run();
    name.month = 8;
    int months = name.calculateMonthsToBirthday();
    System.out.println("Months until birthday :"+ months);
    name.talk("Hello!");
    name.walk(77);

}
    
}