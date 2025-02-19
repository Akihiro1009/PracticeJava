package lottery;

import java.util.Arrays;

public class lotteryTicket {
    public static void main(String[] args) {
        int[][] ticket1 = { {15, 7, 28},
                            {26, 18, 43},
                            {32, 4, 16}
        };

        int[][] ticket2 = new int[3][3];

        System.out.println(ticket1[0][1]);
        System.out.println("-----------------");

        for(int i = 0; i < 3; i++) {
            System.out.println(ticket1[i][i]);
        }

        System.out.println("-----------------");
        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                System.out.println(ticket1[i][j]);
            }
        }
    }
}
