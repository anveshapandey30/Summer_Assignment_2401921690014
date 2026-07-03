 
    import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int target = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = -1;

        System.out.println("I'm thinking of a number between 1 and 100. Try to guess it!");

        while (guess != target) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < target) {
                System.out.println("Too low, try again");
            } else if (guess > target) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("You got it! The number was " + target + ". It took you " + attempts + " tries");
            }
        }

        scanner.close();
    }
}

    
