import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int guess = 0;
        int NumberOfGuess = 0;
        Random random = new Random();
        int answer = random.nextInt(10-1) + 1;
    

        while (guess != answer){
            System.out.print("Enter your guess:");
            guess = scanner.nextInt();
            NumberOfGuess = NumberOfGuess + 1;

            if (guess < answer) {
                System.out.println("your guess is too low.")
            } else if (guess > answer) {
                System.out.println("your guess is too high.")
            } else{
                System.out.println("you got it")
            }
        }

        System.out.println("It took you" + NumberOfGuess + "Guess")
    }
}