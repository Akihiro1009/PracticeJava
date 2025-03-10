package TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = {
                {' ', '|',' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|',' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|',' ', '|', ' '},
        };
        /* old way.
        for(int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }*/

        printGameBoard(gameBoard);
    }
    public static void printGameBoard(char[][] gameBoard) {
        for(char[] row : gameBoard) {
            for(char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
