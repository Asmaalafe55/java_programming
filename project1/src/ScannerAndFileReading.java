package project1.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerAndFileReading {
    public static void main(String[] args) throws FileNotFoundException {
        String myFile = "project1/src/test.txt";

        File file = new File(myFile);

        Scanner text = new Scanner(file);

        int value = text.nextInt();
        // reading int number in file
        System.out.println("Value is = " + value);

        while(text.hasNextLine()){ // while there are another lines in the file
            String line = text.nextLine(); // reading from file 
            System.err.println(line);
        }
        text.close(); // closing the scanning 


    }
}
