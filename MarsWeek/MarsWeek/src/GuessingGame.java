import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessingGame {
    GuessingGame() {
        System.out.println("Welcome to the Guessing Game.");
        System.out.println("Please give your name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        Random rand = new Random();
        int number = rand.nextInt(100);

        System.out.println("Welcome to the Guessing Game " + name + "\nI chose a number between 1 to 100.\n Please guess the number : ");
        int tries = 1;

        do {
            int guess ;
            try {
                guess = sc.nextInt();
            } catch (InputMismatchException e) {
                String not_int = sc.next();
                System.out.println(not_int + "Your guess should be a number.");
                continue;
            }

            if (guess < 1 || guess >100) {
                System.out.println("Please enter a number between 1 and 100 only.");
                continue;
            }

            if (number > guess) {
                System.out.println("Your guess is smaller.");
            }else if (number < guess) {
                System.out.println("Your guess is larger.");
            }else {
                System.out.println("You got it");
                break;
            }

            tries++;
        } while (true);
    
        System.out.println("The number of guesses you took is : " + tries);
        sc.close();
    }
}
