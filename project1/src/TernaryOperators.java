package project1.src;

public class TernaryOperators {
    public static void main(String[] args) {
        int number =20;
        System.out.println(number>20 ? number : 20);
        String text = "End";
        System.out.println(text.equals("End") ? "ending" : "loading..");

        int[] numbers = {43,75,27,6,84};
        int lowestNumber = Integer.MAX_VALUE;
        for (int currentNumber : numbers){
            lowestNumber = currentNumber<lowestNumber ? currentNumber : lowestNumber;
            System.out.println(lowestNumber);
        }


    }
}
