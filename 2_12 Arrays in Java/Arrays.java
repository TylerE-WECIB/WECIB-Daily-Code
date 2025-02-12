import java.util.Scanner;

public class Arrays {
    public static void task1(){ // Task 1: Declare an Array
        // Declare an integer array named numbers with a size of 5.
        int[] numbers;
        numbers = new int[5];
        // Print all elements of the array to show their default values.
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }

    public static void task2(){ // Task 2: Declare an Array and fill the values in multiple lines
        // Declare an integer array named numbers with a size of 5.
        int[] numbers = new int[5];
        // Assign the values 21, 12, 22, 11, 2 to the array using separate assignment statements.
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        // Print the complete array.
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }

    public static void task3(){ // Task 3: Declare an Array and fill the values in one line
        // Declare and initialize an integer array named numbers with a size of 5 in one line.
        // Assign the values 21, 12, 22, 11, 2 directly.
        int[] numbers = {21, 12, 22, 11, 2};
        // Print the complete array.
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }

    public static void task4(){ // Task 4: Declare an Array and fill the values using a for loop
        // Declare an integer array named numbers with a size of 5.
        int[] numbers = new int[5];
        // Use a for loop to populate the array starting with 3, then fill it with increasing multiples of 3.
        for (int i = 0; i < 5; i++) {
            numbers[i] = 3 * (i+1);
        }
        // Print the complete array.
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

    }

    public static void task5(){ // Task 5: Declare an Array and fill the values using a for loop, char edition
        // Declare a char array named charArray with a size of 5.
        char[] charArray = new char[5];
        // Set the first element to 'A'.
        charArray[0] = 'A';
        // Use a for loop to fill the array with the next respective letters, increasing by 2 each time. You must use math, you cannot hard code.
        for(int i = 1; i < 5; i++){
            charArray[i] = (char)(charArray[(i - 1)] + 2);
        }
        // Print the complete array.
        System.out.println(charArray[0]);
        System.out.println(charArray[1]);
        System.out.println(charArray[2]);
        System.out.println(charArray[3]);
        System.out.println(charArray[4]);
    }

    public static void task6(){ // Task 6: User-Defined Array with Random Values
        // Prompt the user to enter the size of the array.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = input.nextInt();
        // Create an array of that size.
        int[] randArray = new int[arraySize];
        // Fill it with random numbers between 1 and 100 using a for loop.
        for (int i = 0; i < arraySize; i++) {
         randArray[i] = (int)(Math.random() * 100) + 1;   
        }
        // Print the array values.
        for (int i = 0; i < arraySize; i++){
            System.err.println(randArray[i]);
        }
        input.close();

    }

    public static void main(String[] args) { //call all of the tasks
        System.out.println("Task 1");
        task1();
        System.out.println();


        System.out.println("Task 2");
        task2();
        System.out.println();


        System.out.println("Task 3");
        task3();
        System.out.println();

        
        System.out.println("Task 4");
        task4();
        System.out.println();


        System.out.println("Task 5");
        task5();
        System.out.println();


        System.out.println("Task 6");
        task6();
    }
}