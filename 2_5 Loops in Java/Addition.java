// BEGIN
import java.util.Random; //this has more convenient methods than Math.random
import java.util.Scanner;

public class Addition{

    public static void main(String[] args) {
    Random rng = new Random();
    Scanner input = new Scanner(System.in);

    // Generate two random numbers between 0 and 9
    // SET number1 = RANDOM(0-9)
    // SET number2 = RANDOM(0-9)
    
    int number1 = rng.nextInt(10); //10 is the upper bound exclusive. range is 0-9
    int number2 = rng.nextInt(10);


    // Prompt user for input
    // PRINT "What is " + number1 + " + " + number2 + "? "
    // READ answer
    
    System.out.printf("What is %d + %d? ",number1,number2);
    int answer = input.nextInt();


    // Keep asking until the user gets it right
    // WHILE (answer ≠ number1 + number2) DO
    //     PRINT "Wrong answer. Try again. What is " + number1 + " + " + number2 + "? "
    //     READ answer
    // END WHILE

    while(answer != (number1 + number2)){
        System.out.printf("Wrong answer. Try again. What is %d + %d? ",number1,number2);
        answer = input.nextInt();
    }

    // Correct answer message
    // PRINT "You got it!"
    System.out.println("You got it!");
    input.close();
    // END
    
}
}