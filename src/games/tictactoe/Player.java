package games.tictactoe;

public class Player {
    private String name;
    private Piece piece;
    private int wins;
    private int loses;
    private int ties;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public String toString() {
        return String.format("%s Wins: %s, Loses: %s, Ties: %s", getName(), getWins(), getLoses(), getTies());
    }
}
