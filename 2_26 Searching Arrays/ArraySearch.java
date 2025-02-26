// necessary imports go here
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        //debug lines
        // int[] testArray = {0,1};
        // int testval = binarySearch(testArray, 1);
        // System.out.println(testval);

        // TODO: Get array size from user using Scanner

        Scanner input = new Scanner(System.in);
        int arraySize = -1; //initial state of the size of the array. must be overridden with a positive integer
        // TODO: Validate input to ensure a positive integer for array size

        while(arraySize <= 0){
            System.out.println("Enter the size of the array (must be a positive integer): ");
            if(input.hasNextInt()){
                arraySize = input.nextInt();
            }else{
                input.next();
            }
        }
        System.out.println();

        // TODO: Create an array of the specified size and fill with random numbers
        int[] numArray = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            numArray[i] = (int)(Math.random()*1000)+1;
            // System.out.print(numArray[i] + " "); debug line
        }
        // TODO: Get target number from user using Scanner
        
        int targetNum = -1; //initial state of the target number. must be overridden with a positive integer
        // TODO: Validate input to ensure a positive integer for the target number if found

        while(targetNum <= 0){
            System.out.println("Enter a target number to search for (must be a positive integer): ");
            if(input.hasNextInt()){
                targetNum = input.nextInt();
            }else{
                input.next();
            }
        }
        System.out.println();


        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();

        // TODO: Implement linear search to find the index of the target number
        int linearSearchResult = linearSearch(numArray, targetNum);
        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");
        // TODO: Display the result of the linear search (index or not found)
        System.out.println("Result: " + linearSearchResult + "\n");

        // Sort the array using built-in method of the Arrays class
        System.out.println("Sorting the array...");
        // TODO: Sort the array as specified above
        Arrays.sort(numArray);

        // Binary Search
        System.out.println("Starting binary search...");
        long binaryStartTime = System.nanoTime();

        // TODO: Implement binary search to find the index of the target number if found, -1 if not
        int binarySearchResult = binarySearch(numArray, targetNum);
        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        // TODO: Display the result of the binary search (index or not found)
        System.out.println("Result: " + binarySearchResult + "\n");



        // TODO: Display results specified in Display Output section
        System.out.println("\n\nDisplay Output:\nLinear Search Time: " + (linearEndTime - linearStartTime) + " nanoseconds.\nBinary Search Time: " + (binaryEndTime - binaryStartTime) + " nanoseconds.\n"
         + (((linearEndTime - linearStartTime))<((binaryEndTime - binaryStartTime)) ? "Linear was faster" : ((linearEndTime - linearStartTime))>((binaryEndTime - binaryStartTime)) ? "Binary was faster" : "Both were the same speed."));
        System.out.println();
        if(linearSearchResult != -1){ //brain wasn't braining i forgot how to use lambdas for this
            System.out.println("Linear index found at " + linearSearchResult);
        }else{
            System.out.println("Linear value not found.");
        }

        if(binarySearchResult != -1){
            System.out.println("Binary index found at " + binarySearchResult);
        }else{
            System.out.println("Binary value not found.");
        }
        input.close();
    }

    public static int linearSearch(int[] searchArray, int searchNum){
        //go through every index of the list until the number is found. return -1 if number isn't found and return the index if it is
        for (int i = 0; i < searchArray.length; i++) {
            if (searchNum == searchArray[i]) {
                return i; //returns index of where the number was found
            }
        }
        return -1; //only reach if index not found in list
    }
    public static int binarySearch(int[] searchArray, int searchNum){
        int maxPoint = searchArray.length;
        int minPoint = 0;

        if(searchArray[minPoint] == searchNum){ //accounting for array of size 1
            return minPoint;
        }

        while(maxPoint != minPoint + 1){
            // System.out.println(maxPoint + " " + minPoint); debug line
            int midpoint = (minPoint + maxPoint)/2;
            if(searchArray[midpoint] == searchNum){ //value == midpoint (we win!)
                return midpoint;
            }else if(searchNum > searchArray[midpoint]){ //value > midpoint
                minPoint = midpoint;
            }else{ //value < midpoint
                maxPoint = midpoint;
            }
        }
        return -1; //only reach if index not found in list
    }
}
