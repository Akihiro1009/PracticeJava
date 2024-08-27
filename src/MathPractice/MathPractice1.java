package MathPractice;

import java.util.Scanner;

public class MathPractice1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scx = new Scanner(System.in);
        Scanner scy = new Scanner(System.in);

        GetMath number = new GetMath(100, 200);

        System.out.println(number.getX());
        System.out.println(number.getY());
        String result = (Math.max(number.getX(), number.getY()) == number.getX()) ? "x" : "y";
        System.out.println("The bigger number is " + Math.max(number.getX(), number.getY()) + " and it is " + result);


        /*int x = 300;
        int y = 200;
        System.out.println(Math.max(x, y)); //the Math.max compares the (x and y) and gives us the bigger result. here i got a result of "200"
        // I want to output the name of the int which is bigger.
        String result = (Math.max(x, y) == x) ? "x" : "y";
        System.out.println(result);

         */

    }
}
