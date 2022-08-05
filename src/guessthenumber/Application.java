package guessthenumber;
import games.guessthenumber.guesstheNumber;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int totalGames = 0;
        Scanner reader = new Scanner(System.in);
        while (true) {
            guesstheNumber game = new guesstheNumber();
            game.run();
            System.out.println();
            System.out.println(" press " + " yes " + " to continue and " + " no " + " to exit ");
            char exit = reader.next().charAt(0);
            totalGames++;
            if (exit == "n".charAt(0) || exit == "N".charAt(0)){
                break;
            }
        }
        System.out.println();
        System.out.println("Total Games played"+ totalGames);
        System.out.println("wins: " + guesstheNumber.wins);
        System.out.println();
        System.out.println("loss: "+ guesstheNumber.loss);
        System.out.println();

    }
}
