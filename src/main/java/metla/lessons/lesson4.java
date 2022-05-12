package metla.lessons;

import java.util.Random;

public class lesson4 {
    public static final int WIDTH = 10;
    public static final int HEIGT = 10;
    public static final int MINES_COUNT = 20;
    public static final int MINE = 1000;
    public static final int EMPTY = 0;

    public static void main(String[] args) {
        play();

    }

    public static void play() {
        boolean win = true;
        int[][] board = generateBoard();{
            printBoard(board);
        }

    }


    private static int[][] generateBoard() {
        int[][] board = new int[HEIGT][WIDTH];
        Random random = new Random();
        int mines = MINES_COUNT;
        while (mines > 0) {
            int x, y;
            do {
                x = random.nextInt(HEIGT);
                y = random.nextInt(WIDTH);
            } while (board[x][y] == 1000);
            board[x][y] = 1000;
            mines--;
        }
        for (int i=0; i <HEIGT;i++){
            for (int j=0; j<WIDTH; j++)
                if (board[i][j] == MINE)
                    continue;

        }


        return board;
    }

    public static void printBoard(int[][] board) {
    }

}
