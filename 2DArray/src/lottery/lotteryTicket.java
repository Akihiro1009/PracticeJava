package lottery;

import java.util.Arrays;

public class lotteryTicket {

    public static void LotteryTicket() {
        int[][] ticket = {{15, 7, 28, 43},
                            {26, 18, 48, 67},
                            {52, 24, 94, 27}};
    }


    public static void allNums(){
        /*for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                System.out.println(ticket[i][j]);
            }
        }*/
    }

    public static void main(String[] args) {
        int[][] ticket = {{15, 7, 28, 43},
                {26, 18, 48, 67},
                {52, 24, 94, 27}};

        System.out.println(ticket[0][1]);
        System.out.println("-----------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(ticket[i][j]);
                System.out.print(" ");
            }
            System.out.println(); // is there a better way?
        }

        System.out.println("-----------------");

        for (int i = 0; i < 3; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += ticket[i][j];

            }
            System.out.println("the sum of the row is" + sum);

            /* for j without {} is ok?
            for (int j = 0; j < 4; j++)
                sum += ticket[i][j];

            System.out.println("the sum of the rol is " + sum);*/
        }
    }
}
