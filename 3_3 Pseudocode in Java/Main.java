//import random module
//import scanner module
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //i believe the intent is to shift every index 3 to the right, but following the psuedocode exactly does not produce that outcome
        
        //defining objects
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        
        //get user input to create the size of the array (minimum 5)
        System.out.println("Type the size of the array (minimum 5): ");
        int userInput = input.nextInt();
        while(userInput < 5){
            System.out.println("Invalid. Must be >= 5: ");
            userInput = input.nextInt();
        }

        int[] userArray = new int[userInput];
        //FOR iterating through user inputted length of array
        for (int i = 0; i < userArray.length; i++) {
            //fill with random values 1 to 50
            userArray[i] = randomizer.nextInt(1,51);
        }
        //display filled array
        System.out.print("User array: ");
        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }
        
        //store the last the 3 indexes of the array in variables
        int lastNum = userArray[userArray.length - 1];
        int secondToLastNum = userArray[userArray.length - 2];
        int thirdToLastNum = userArray[userArray.length - 3];

        //for loop to iterate through the array
        for (int i = 0; i < userArray.length; i++) {
            //set current index of the for loop to be that index plus 3
            //until the index is the length of the array - 3 then terminate
            if(i == userArray.length - 3){
                break;
            }
            userArray[i] = userArray[i+3]; //had to ignore the comment order here because indexOutOfBounds error
        }

        //once the list is changed in the for loop, set the first 3 indexes to the ones you saved in order
            //i'll assume 3rd -> 1st is the order but it could also be interpreted 1st -> 3rd
        userArray[0] = thirdToLastNum;
        userArray[1] = secondToLastNum;
        userArray[2] = lastNum;

        //debug print statements. original pseudocode never says to print the modified array
        // System.out.print("\nUser array: ");
        // for (int i = 0; i < userArray.length; i++) {
        //     System.out.print(userArray[i] + " ");
        // }
        input.close();
    }
}