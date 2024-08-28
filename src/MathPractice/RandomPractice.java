package MathPractice;

import java.util.Random;

import static MathPractice.MathPractice1.sc;

public class RandomPractice {

    static int x = 0;
    static int y = 0;

    public static void main(String[] args) {
        Random rand = new Random();

        do {
            System.out.print(">>>what is your first number?: ");
            x = sc.nextInt();

            System.out.print(">>>what is your second number?: ");
            y = sc.nextInt();

            if ( y < x ) {
                System.out.println(">>>First number cant be bigger than second number.\n");
            }
            else {
                int r = rand.nextInt(); //what should the inside of this bracket be?
                System.out.println(r);
            }
        }while (y < x);
        System.out.println(">>>the loop has finished");

        /*double r = rand.nextInt();
        System.out.println(r);

         */
    }
}
