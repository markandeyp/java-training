package games.tictactoe;

public class TicTacToe {
    private final Board board = new Board();

    public void run() {
        board.setupGame();
        board.displayBoard();
        while (!board.isGameOver()) {
            board.promptMove();
            board.displayBoard();
        }
        System.out.println(board.getWinner());
        System.out.println(board.getLoser());
        System.out.println("Game Over");
    }
}
