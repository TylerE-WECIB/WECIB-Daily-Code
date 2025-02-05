// BEGIN
import java.util.Scanner;

public class DoIt{
    public static void main(String[] args) {
        // Declare a variable for user input
        Scanner input = new Scanner(System.in);

        // REPEAT AT LEAST ONCE
        // DO
        //     Prompt the user to enter a positive number
        //     Read input
        // WHILE (input is negative)

        int num = -1; //declared as negative initially so the loop runs
        do {
            System.out.print("Enter a positive number: "); 
            num = input.nextInt();
            if(num < 1){
                System.out.println("Invalid input. Try again.");
            }
        } while (num < 1);
        // Display valid input message
        System.out.printf("You entered: %d",num);
    // END
    }
}