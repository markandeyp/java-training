package games.tictactoe;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Board {
    /*
     * WINNING_MOVES Constant
     * */
    private final Move[][] WINNING_MOVES = {
            {
                    new Move(1, 1), new Move(2, 1), new Move(3, 1)
            },
            {
                    new Move(1, 2), new Move(2, 2), new Move(3, 2)
            },
            {
                    new Move(1, 3), new Move(2, 3), new Move(3, 3)
            },
            {
                    new Move(1, 1), new Move(1, 2), new Move(1, 3)
            },
            {
                    new Move(2, 1), new Move(2, 2), new Move(2, 3)
            },
            {
                    new Move(3, 1), new Move(3, 2), new Move(3, 3)
            },
            {
                    new Move(1, 1), new Move(2, 2), new Move(3, 3)
            },
            {
                    new Move(1, 3), new Move(2, 2), new Move(3, 1)
            }
    };

    private final Player playerOne;
    private final Player playerTwo;

    private final char[][] board = new char[3][3];
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();
    private int movesLeft = 9;
    private boolean hasWinner = false;

    private Player winner;
    private Player loser;

    public boolean isGameOver() {
        return hasWinner || movesLeft == 0;
    }

    public Player getWinner() {
        return winner;
    }

    public Player getLoser() {
        return loser;
    }

    /*
     * Constructor
     * */
    public Board() {
        playerOne = new Player();
        playerTwo = new Player();
        for (char[] row : board) {
            Arrays.fill(row, '_');
        }
    }

    /*
     * Function to set up the game
     * */
    void setupGame() {
        System.out.print("Enter player one's name:");
        playerOne.setName(scanner.next());
        System.out.print("Enter player two's name:");
        playerTwo.setName(scanner.next());

        if (random.nextBoolean()) {
            playerOne.setPiece(Piece.X);
            playerTwo.setPiece(Piece.O);
        } else {
            playerOne.setPiece(Piece.O);
            playerTwo.setPiece(Piece.X);
        }

        System.out.printf("%s is %s\n", playerOne.getName(), playerOne.getPiece());
        System.out.printf("%s is %s\n", playerTwo.getName(), playerTwo.getPiece());
    }

    /*
     * Function to display the board
     * */
    void displayBoard() {
        for (char[] row : board) {
            for (char column : row) {
                System.out.printf("%s\t", column);
            }
            System.out.println();
        }
    }

    void promptMove() {
        Player currentPlayer;
        if (movesLeft % 2 == 1) {
            currentPlayer = playerOne;
        } else {
            currentPlayer = playerTwo;
        }

        Move move;
        do {
            System.out.printf("Hi %s, Enter your move\n", currentPlayer.getName());
            System.out.print("Row:");
            int row = scanner.nextInt();
            System.out.print("Column:");
            int column = scanner.nextInt();
            move = new Move(row, column);
        } while (!isValidMove(move));

        board[move.getRowIndex()][move.getColumnIndex()] = currentPlayer.getPiece().toString().charAt(0);
        movesLeft -= 1;
        checkForWinner();
    }

    private boolean isValidMove(Move move) {
        boolean isValid = move.getRow() <= 3 && move.getRow() >= 1 && move.getColumn() <= 3 && move.getColumn() >= 1;

        if (board[move.getRowIndex()][move.getColumnIndex()] != '_') {
            isValid = false;
        }

        if (!isValid) {
            System.out.println("Invalid move");
        }
        return isValid;
    }

    private void checkForWinner() {
        for (Move[] moves : WINNING_MOVES) {
            char value = board[moves[0].getRowIndex()][moves[0].getColumnIndex()];
            if (value != '_' && value == board[moves[1].getRowIndex()][moves[1].getColumnIndex()] && value == board[moves[2].getRowIndex()][moves[2].getColumnIndex()]) {
                hasWinner = true;
                Piece winningPiece = Piece.valueOf(String.valueOf(value));
                winner = playerOne.getPiece() == winningPiece ? playerOne : playerTwo;
                loser = playerOne.getPiece() == winningPiece ? playerTwo : playerOne;
                break;
            }
        }

        if (hasWinner) {
            winner.setWins(winner.getWins() + 1);
            loser.setLoses(loser.getLoses() + 1);
            System.out.printf("Congratulation %s!\n", winner.getName());
        } else if (movesLeft == 0) {
            playerOne.setTies(playerOne.getTies() + 1);
            playerTwo.setTies(playerTwo.getTies() + 1);
        }
    }
}
