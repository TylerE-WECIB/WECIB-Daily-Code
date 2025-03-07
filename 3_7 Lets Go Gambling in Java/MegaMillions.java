import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class MegaMillions {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static double balance;
    static double totalWinnings = 0;
    static double totalSpent = 0;
    public static void main(String[] args) {
        initializeGame();
        
        // TODO: Run the game loop until the player can no longer play
        runGame();

        printGameSummary();
    }

    // TODO: Initialize the game (set balance, print welcome message)
    public static void initializeGame(){
        balance = 50.0;
        System.out.println("      WELCOME TO MEGA MILLIONS!\n" + "=".repeat(38) + "\nYou start with $50.00\n\n" + "-".repeat(38));
        
    }

    // TODO: Run the game loop (handle multiple rounds of play)
    public static void runGame(){
        while(true){ //probably needs a condition like while balance > 0
            playRound();
        }
    }

    // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)
    public static void playRound(){
        //like the guy from deltarune?

        //number selection
        String quickPickChoice = getQuickPickChoice();

        //ticket purchase

        //draw numbers
        int[] randomNumbers = generateNumbers();

        //check results

        //update balance
        updateBalance();
    }
    // TODO: Update balance after ticket purchase and winnings
    public static void updateBalance(){
        //update the balance
    }

    // TODO: Print game summary (total spent, total winnings, final balance)
    public static void printGameSummary(){

    }

    // TODO: Generate an array of 5 unique random numbers (1-70)
    public static int[] generateNumbers(){
        int[] randomNumbers = new int[5];
        int searchnum = 0;
        int newRNum;
        while(searchnum < randomNumbers.length){
            newRNum = random.nextInt(1,71);
            if(!contains(randomNumbers, newRNum)){
                randomNumbers[searchnum] = newRNum;
                searchnum++;
            }
        }
        return randomNumbers;
    }

    // TODO: Get a valid number input from the user within a given range
    public static int getValidNumber(int min, int max){
        int finalnum = min-1;
        while(finalnum < min || finalnum > max){
            if(scanner.hasNextInt()) {
                finalnum = scanner.nextInt();
                if(finalnum < min || finalnum > max){
                    System.out.printf("Invalid Input. Must be an integer between %d and %d (inclusive): ",min,max);
                }
            }else{
                System.out.printf("Invalid Input. Must be an integer between %d and %d (inclusive): ",min,max);
                scanner.next();
            }
        }
        return finalnum;
    }
    // TODO: Check if an array contains a specific number
    public static boolean contains(int[] array, int number){
        for (int numindex : array) {
            if(numindex == number){
                return true;
            }
        }
        return false;
    }

    // TODO: Count matching numbers between user and winning numbers
    public static int countMatches(int[] userNums, int[] winingNums){
        int matches = 0;
        for(int i: userNums){
            if(contains(winingNums,i)){
                matches++;
            }
        }

        return matches;
    }

    // TODO: Determine the prize amount based on matches
    public static void getPrize(int matchCount, boolean megaBallMatch){

    }

    // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)
    public static int getRandomMegaplier(){
        return random.nextInt(2,6);
    }

    public static String getQuickPickChoice(){
        System.out.println("Do you want to Quick Pick? (yes/no): ");
        String choice = scanner.nextLine();
        while(choice.isEmpty()){
            choice = scanner.nextLine();
        }
        while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
            //System.out.println("current choice is " + choice);
            System.out.println("Invalid. Must be yes/no: ");
            choice = scanner.nextLine();
        }
        return choice.toLowerCase();
    }
}
