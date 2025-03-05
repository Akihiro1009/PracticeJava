package Main;

import ScannerPractice.ScannerPracticeOne;

public class Main {
    public static void main(String[] args) {
        int number = 18;
        String numberString = "21";
        System.out.println(Integer.parseInt(numberString));

        number = Integer.parseInt(numberString) + number;
        System.out.println(number);
    }
}
