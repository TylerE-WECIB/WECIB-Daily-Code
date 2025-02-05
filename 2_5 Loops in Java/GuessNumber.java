// BEGIN
import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args) {
        // Choose a hidden number
        Random rng = new Random();
        Scanner input = new Scanner(System.in);
        int hiddenNum = rng.nextInt(101); //random number from 0 to 100
        // Prompt the user to start guessing
        int guess = -1; //what the user guessed. if it's initialized at -1 then it cant be right so the user has to guess at least once
        System.out.print("Guess a magic number between 0 and 100: ");


        // Repeat until the correct guess is made
        // WHILE (true) DO
        //     Ask for a guess
        //     Get user input

        //     IF the guess is correct THEN
        //         Display success message
        //         Exit the loop
        //     ELSE IF the guess is too high THEN
        //         Give a hint
        //     ELSE
        //         Give a different hint
        //     END IF
        // END WHILE

        while(guess != hiddenNum){ //loops until the hiddenNum is successfully guessed by the user. calls input for guess every loop
            guess = input.nextInt();
            if(guess != hiddenNum){
                System.out.println("Your guess is too " + ((guess > hiddenNum) ? "high":"low") + "\n");
                System.out.print("Enter your guess: ");
            }else{
                System.out.println("Yes, the number is " + hiddenNum);
                break;
            }
        }
        // END

    }
}
