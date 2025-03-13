package racing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RacingTicket { //競馬の馬券。A、B、Cがランダムであたりで、
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 10 >>> ");
        int guess = sc.nextInt();

        Random a = new Random();
        int randomA = a.nextInt(10)+1;
        Random b = new Random();
        int randomB = b.nextInt(10)+1;
        Random c = new Random();
        int randomC = c.nextInt(10)+1;

        while (randomB == randomA) {
            //System.out.println("randomA : " + randomA);
            //System.out.println("randomB : " + randomB);
            b = new Random();
            randomB = b.nextInt(10)+1;
        }

        while (randomC == randomB || randomC == randomA) {
            c = new Random();
            randomC = c.nextInt(10)+1;
        }

        int[] winner = {randomA,randomB,randomC};

        /* //for loop to test the random(), loop for 50.
        for (int i = 0; i < 50; i++){
            Random b = new Random();
            int randomB = b.nextInt(10)+1;
            System.out.println(randomB);
        }
        */

        System.out.println(randomA);
        System.out.println(randomB);
        System.out.println(randomC);
        System.out.println(Arrays.toString(winner));
    }
}
