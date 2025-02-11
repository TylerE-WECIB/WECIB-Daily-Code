import java.util.Scanner;

public class AllInOne {
    public static void processNumbers(int num1, int num2, int num3) {
        // Calculate sum
        int sum = summate(num1, num2, num3);
        // Find max
        int max = maximate(num1, num2, num3);
        // Find min
        int min = minimatize(num1, num2, num3);
        // Calculate average
        double average = averegiate(sum);
        // Check if all numbers are positive
        boolean allPositive = positivitize(num1, num2, num3);
        // Print results
        printButAwesome(num1, num2, num3, sum, max, min, average, allPositive);


        /*holdover code in case i need to look at it again
        
        int sum = num1 + num2 + num3;
       
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
       
        double average = sum / 3.0;
       
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");*/
    }
    
    public static int summate(int numA, int numB, int numC){  //adds 3 numbers
        return numA + numB + numC;
    }
    public static int maximate(int numA, int numB, int numC){ //finds max of 3 numbers
        int max = numA;
        if (numB > max) {
            max = numB;
        }
        if (numC > max) {
            max = numC;
        }
        return max;
    }

    public static int minimatize(int numA, int numB, int numC){ //finds min of 3 numbers
        int min = numA;
        if (numB < min) {
            min = numB;
        }
        if (numC < min) {
            min = numC;
        }
        return min;
    }

    public static double averegiate(int inputSum){ //takes sum of 3 nums and finds the average
        return inputSum / 3.0;
    }

    public static boolean positivitize(int numA, int numB, int numC){ //checks if all ints are positive
        return (numA > 0 && numB > 0 && numC > 0);
    }

    public static void printButAwesome(int numA, int numB, int numC, int sum, int max, int min, double average, boolean allPositive){ //formats and prints everything
        System.out.println("\nSum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + numA + ", " + numB + ", and " + numC + " is " + sum + ".");
    }

    public static void getUserInput(){ //takes the user input of 3 numbers and calls processNumbers
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter 3 numbers to find information about them!\nNum 1: ");
        while (!userInput.hasNextInt()) { //input validation is that easy? thanks john stackoverflow.
            System.out.print("Enter an integer come on dude (Num 1): "); //slight statement of disapproval to convince the user to change their ways
            userInput.nextLine(); //skips to the next line of user input if the user didn't enter a number correctly
        }
        int num1 = userInput.nextInt(); //only get here once a valid input is found because the while loop is an infinite defense
        
        userInput.nextLine();
        System.out.print("Num 2: "); //same stuff but second number
        while (!userInput.hasNextInt()) {
            System.out.print("Enter an integer come on dude (Num 2): ");
            userInput.nextLine();
        }
        int num2 = userInput.nextInt();
       
        userInput.nextLine();
        System.out.print("Num 3: "); //same stuff but third number
        while (!userInput.hasNextInt()) {
            System.out.print("Enter an integer come on dude (Num 3): ");
            userInput.nextLine();
        }
        int num3 = userInput.nextInt();
                
        processNumbers(num1, num2, num3);
        userInput.close();
    }
    public static void main(String[] args) {
        getUserInput();
    }
}