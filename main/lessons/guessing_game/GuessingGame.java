package guessing_game;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int target = 50;

        int n;

        int timesOfGuessLeft = 3;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Enter a number: ");
            n = scanner.nextInt();
            if (n == target) {
                System.out.println("Congratulations! You have guess the target!");
                break;
            }
            timesOfGuessLeft--;

            if (timesOfGuessLeft <= 0 ) {
                System.out.println("Oops! You ran out of guesses, game over.");
                break;
            }
        } while (n != target);
    }
}
