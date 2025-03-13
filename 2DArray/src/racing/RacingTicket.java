package racing;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RacingTicket { //競馬の馬券。A、B、Cがランダムであたりで、
    static Scanner sc = new Scanner(System.in);
    static int scores;
    public static void main(String[] args) {
        boolean answer;
        do{
            system();
            System.out.println(">Your current score is " + getScore() + " points!");
            System.out.print("do you want to try again? (y/n) >>> ");
            char temp = sc.next().charAt(0);
            if(temp == 'y'){
                answer = true;
            } else {
                answer = false;
            }
            System.out.println("------------------------------");
        }while (answer);

    }
    public static void system(){
        while(true) {
            System.out.print("Guess a number from 1 to 10 >>> ");
            int guess = sc.nextInt();
            sc.nextLine();
            if(guess ){//if guess is a int
                if (1 < guess && guess < 10) {
                    return;
                }
            }
        }

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

        System.out.println("First place: " + randomA);
        System.out.println("Second place: " +randomB);
        System.out.println("Third place: " + randomC);

        if (randomA == guess) {
            System.out.println("you have won 1000 points!");
            scores += 1000;
        } else if (randomB == guess) {
            System.out.println("you have won 500 points!");
            scores += 500;
        } else if (randomC == guess) {
            System.out.println("you have won 100 points!");
            scores += 100;
        }

        int[] winner = {randomA,randomB,randomC};

        /* //for loop to test the random(), loop for 50.
        for (int i = 0; i < 50; i++){
            Random b = new Random();
            int randomB = b.nextInt(10)+1;
            System.out.println(randomB);
        }
        */

        /*if(scores > 1){
            System.out.println(">Your total score is " + scores + " points this round!");
        } else {
            System.out.println(">You didn't score any points this round...");
        }*/

        //System.out.println(Arrays.toString(winner));
    }

    public static int getScore(){
      return scores;
    }
}
