package racing;

import java.util.Arrays;
import java.util.Random;

public class RacingTicket {
    public static void main(String[] args) {
        Random a = new Random();
        int randomA = a.nextInt(10)+1;
        Random b = new Random();
        int randomB = b.nextInt(10)+1;
        Random c = new Random();
        int randomC = c.nextInt(10)+1;

        int[] winner = {randomA,randomB,randomC};

        /*for (int i = 0; i < 50; i++){
            Random b = new Random();
            int randomB = b.nextInt(10)+1;
            System.out.println(randomB);
        }*/

        System.out.println(randomA);
        System.out.println(randomB);
        System.out.println(randomC);
        System.out.println(Arrays.toString(winner));
    }
}
