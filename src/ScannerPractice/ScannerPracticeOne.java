package ScannerPractice;

import static MathPractice.MathPractice1.sc;

public class ScannerPracticeOne {

    public static void main(String[] args) {
        int scx = sc.nextInt();
        int scy = sc.nextInt();

        System.out.println(scx);
        System.out.println(scy);
        String result = scx > scy ? "x" : "y";
        System.out.println("The bigger number is " + Math.max(scx, scy) + " and it is " + result);
    }

}
