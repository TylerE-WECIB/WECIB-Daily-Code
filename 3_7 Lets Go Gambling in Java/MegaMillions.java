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
        System.out.println("      WELCOME TO MEGA MILLIONS!\n" + "=".repeat(38) + "\nYou start with $50.00\n");
        
    }

    // TODO: Run the game loop (handle multiple rounds of play)
    public static void runGame(){
        String keep_playing = "yes";
        while(keep_playing.equals("yes") && (int)balance >= 2) {
            playRound();
            if((int)balance >= 2) keep_playing = getYesNo("Do you want to play again?");
        }
    }

    // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)
    public static void playRound(){
        //like the guy from deltarune?

        //number selection
        int[] userNums = new int[5];
        int megaballValue = 0;
        System.out.printf("-".repeat(38) +"\nCurrent Balance: $%.2f\n" + "-".repeat(38)+"\n",balance);
        String quickPickChoice = getYesNo("Do you want to Quick Pick?");

        if(quickPickChoice.equals("yes")){
            userNums = generateNumbers();
            megaballValue = random.nextInt(1,26);
            System.out.printf("Your Quick Pick: %s Mega Ball: %d\n", Arrays.toString(userNums),megaballValue);

        } else if(quickPickChoice.equals("no")) {
            //manual generation
            userNums = new int[5];
            for(int i = 0; i < userNums.length; i++){
                System.out.printf("Type #%d/5. Must be between 1 and 70 (inclusive): ",i+1);
                int nextNumber = getValidNumber(1,70);
                while(contains(userNums,nextNumber)){
                    System.out.print("You already guessed that number >:(  guess a different one: ");
                    nextNumber = getValidNumber(1,70);
                }
                userNums[i] = nextNumber;
            }
            System.out.print("Type Megaball Value. Must be between 1 and 25 (inclusive): ");
            megaballValue = getValidNumber(1,25);
            System.out.printf("Your Choices: %s Mega Ball: %d\n", Arrays.toString(userNums),megaballValue);
        }else{
            System.out.println("Yo something goofed up with quick pick choice somehow cause it equals " + quickPickChoice);
        }
        String megaplierChoice = "no";
        if((int)balance - 2 >= 1){
            megaplierChoice = getYesNo("Do you want to add Megaplier for $1?");
        }

        int megaplier = 1;
        if(megaplierChoice.equals("yes")){
            megaplier = getRandomMegaplier();
//            System.out.println("Megaplier Drawn: x" + megaplier);
        }

        //ticket purchase
        int ticketCost = 2 + (megaplierChoice.equals("yes") ? 1:0);

        //draw numbers
        int[] randomNumbers = generateNumbers();
        int actualMegaball = random.nextInt(1,26);

        //check results
        System.out.println("\n" + "=".repeat(38) + "\n         WINNING NUMBERS:\n" + "=".repeat(38));
        System.out.printf("%s Mega Ball: %d\n", Arrays.toString(randomNumbers),actualMegaball);
        if(megaplierChoice.equals("yes")){
            System.out.printf("Megaplier Drawn: x%d\n",megaplier);
        }
        System.out.println("=".repeat(38));

        int roundWinnings = getPrize(countMatches(userNums,randomNumbers),(megaballValue == actualMegaball)) * megaplier;
        //roundWinnings = getPrize(5,true) * megaplier;
        //
        System.out.println("You won: $" + roundWinnings);
        //update balance
        updateBalance(ticketCost, roundWinnings);
        System.out.printf("New Balance: $%.2f\n",balance);
    }
    // TODO: Update balance after ticket purchase and winnings
    public static void updateBalance(int cost, int winnings){
        balance = balance - cost + winnings;
        totalSpent += cost;
        totalWinnings += winnings;
    }

    // TODO: Print game summary (total spent, total winnings, final balance)
    public static void printGameSummary(){
        System.out.println("\n"+"=".repeat(38) + "\n              GAME OVER\n" + "=".repeat(38));
        System.out.printf("Total Spent: $%.2f\nTotal Winnings: $%.2f\nFinal Balance: $%.2f\n",totalSpent,totalWinnings,balance);
        System.out.print("=".repeat(38));
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
    public static int getPrize(int matchCount, boolean megaBallMatch){
        switch (matchCount){
            case 5:
                if(megaBallMatch) return 100000000;
                return 1000000;
            case 4:
                if(megaBallMatch) return 10000;
                return 500;
            case 3:
                if(megaBallMatch) return 200;
                return 10;
            case 2:
                if(megaBallMatch) return 10;
                return 0;
            case 1:
                if(megaBallMatch) return 4;
                return 0;
            case 0:
                if(megaBallMatch) return 2;
                return 0;
        }
        return 0;
    }

    // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)
    public static int getRandomMegaplier(){
        return random.nextInt(2,6);
    }

    public static String getYesNo(String prompt){
        System.out.print(prompt + " (yes/no): ");
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
