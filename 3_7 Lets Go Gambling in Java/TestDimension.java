import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TestDimension{
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // System.out.println(contains(new int[] { 1, 2, 3, 4}, 3));
//        int[] numArray = generateNumbers();
//        for(int i: numArray){
//            System.out.println(i);
//        }
//        System.out.println("Expected: 2  Actual: " + countMatches(new int[] {1,2,3,4,5}, new int[] {7,2,3,0,60}));
//        System.out.println("Expected: random int  Actual: " + countMatches(new int[] {1,2,3,4,5}, generateNumbers()));
        int userNum = getValidNumber(1,70);
        System.out.println(userNum);
        String qpc = getQuickPickChoice();
        System.out.println(qpc);
    }

    public static boolean contains(int[] array, int number){
        for (int numindex : array) {
            if(numindex == number){
                return true;
            }
        }
        return false;
    }
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
        System.out.println(Arrays.toString(randomNumbers));
        return randomNumbers;
    }
    public static int countMatches(int[] userNums, int[] winingNums){
        int matches = 0;
        for(int i: userNums){
            if(contains(winingNums,i)){
                matches++;
            }
        }

        return matches;
    }
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