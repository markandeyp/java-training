package day2_game;

import java.util.*;
public class GuessResult {
    private final int MAX_GUESSES = 5;
    private int number;
    private int guessCount = 1;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    /*
     * function to generate a random number
     * */
    private void generateRandomNumber() {
        number = random.nextInt(1, 51);
    }



    private int promptGuessFromUser() {
        System.out.print("Enter your guess:");
        return scanner.nextInt();
    }


    private GuessResult checkGuess(int guess) {
        if (guess == number) {
            return GuessResult.CORRECT;
        } else if (guess > number) {
            return GuessResult.HIGHER;
        } else {
            return GuessResult.LOWER;
        }
    }


    private void displayResult(GuessResult result) {
        if (result == GuessResult.CORRECT) {
            System.out.printf("Congratulations! You guessed it right in %s attempt(s)", guessCount);
        } else if (result == GuessResult.HIGHER) {
            System.out.println("You have guessed HIGHER");
        } else {
            System.out.println("You have guessed LOWER");
        }
    }


    public void run() {
        System.out.println(" GUESS THE NUMBER");


        generateRandomNumber();

        while (guessCount <= MAX_GUESSES) {
            int guess = promptGuessFromUser();
            GuessResult result = checkGuess(guess);
            displayResult(result);
            if (result == GuessResult.CORRECT) {
                break;
            }
            guessCount++;
        }

        System.out.println("GAME OVER. THE NUMBER WAS " + number);
    }
}
