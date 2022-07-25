package games.tictactoe;

public class TicTacToe {
    private char[][] board = {
            {'1', '2', '3'},
            {'4', '0', '6'},
            {'7', '8', '9'}
    };

    private void displayBoard() {
        for (char[] row : board) {
            for (char col : row) {
                System.out.printf("%s ", col);
            }
            System.out.println();
        }
    }

    public void run() {
        displayBoard();
    }
}
