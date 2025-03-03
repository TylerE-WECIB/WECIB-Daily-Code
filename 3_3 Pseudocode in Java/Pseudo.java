//import random
import java.util.Random;
import java.util.Scanner;

public class Pseudo{
    public static void main(String[] args) {
        //defining objects
        Scanner input = new Scanner(System.in);
        Random randomizer = new Random();
        //get user input to create the size of the array
        
        System.out.println("Type the size of the array (must be >= 5): ");
        int arraySize = input.nextInt();
        while(arraySize < 5){
            System.out.println("Invalid. Must be >= 5: ");
            arraySize = input.nextInt();
        }

        int[] userArray = new int[arraySize];
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
        
        //store the last the 3indexes of the array in variables
        int lastNum = userArray[userArray.length - 1];
        int secondToLastNum = userArray[userArray.length - 2];
        int thirdToLastNum = userArray[userArray.length - 3];
        input.close();
    }
}