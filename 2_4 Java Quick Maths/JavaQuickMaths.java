// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    // word word word word(Word[] word)    {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        //    - Print the number
        //    - Apply and print results of:
        //      - Math.ceil()
        //      - Math.floor()
        //      - Math.rint()
        //      - Math.round()

        for (double num = 1.0; num <= 5.0; num += 0.5) { //sets a num variable that starts at 1.0 and increments it by 0.5 every loop until it's <= 5.0. the loop prints num at each increment with a bunch of Math rounding methods
            System.out.printf("Number: %.1f  Ceil: %.1f  Floor: %.1f  Rint: %.1f  Round: %d\n",num,Math.ceil(num),Math.floor(num),Math.rint(num),Math.round(num));
        }
        

        // 2. Prompt the user to enter a decimal number
        //    - Store the number
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("\nEnter a decimal number: ");
        double userDecimal = scanner.nextDouble(); //decimal that the user enters. the code then prints the decimal with a bunch of Math rounding methods applied
        scanner.nextLine(); //flushing the buffer
        System.out.printf("Ceil: %.1f  Floor: %.1f  Rint: %.1f  Round: %d\n",Math.ceil(userDecimal),Math.floor(userDecimal),Math.rint(userDecimal),Math.round(userDecimal));

        // 3. Prompt the user to enter an integer
        //    - Store the integer
        //    - Prompt the user to enter a string
        //    - Store the string
        //    - Print the entered integer and string
        System.out.print("\nEnter an integer: ");
        int userInt = scanner.nextInt();
        scanner.nextLine(); //flushing the buffer
        System.out.print("Enter a word: ");
        String userString = scanner.nextLine();
        System.out.printf("You entered integer: %d\nYou entered string: %s",userInt,userString);


        // 4. Demonstrate type casting
        //    - Convert the integer to double (implicit cast) and print
        //    - Convert the decimal number to int (explicit cast) and print
        //    - Convert the integer to a char (ASCII representation) and print
        double intToDouble = userInt; //implicitly casts userInt as a double
        System.out.printf("\n\nImplicit cast (int → double): %.1f",intToDouble);
        System.out.printf("\nExplicit cast (double → int): %d",(int)userDecimal);
        System.out.printf("\nCasting int to char (ASCII): %c",(char)userInt);


        


        // 5. Prompt the user to enter a character
        //    - Store the character
        //    - Convert the character to its ASCII value (int) and print
        System.out.print("\n\nEnter a character: ");
        char userChar = scanner.next().charAt(0);
        System.out.printf("ASCII value of '%c' is: %d",userChar,(int)userChar);


        // 6. Demonstrate String vs. new String()
        //    - Create a String literal and assign it to two variables
        //    - Create another String using new String()
        //    - Compare the first two strings using == (reference check)
        //    - Compare one literal with the new String() object using ==
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        String goku = "KAMEHAMEHA!!!"; //hey it's me!
        String gohan = "KAMEHAMEHA!!!"; //string with identical value. should occupy the same space in memory
        String vegeta = new String("KAMEHAMEHA!!!"); //string with identical value but should occupy a different space in memory

        System.out.printf("\n\nString Comparisons:\nstr1 == str2: %b\nstr1 == str3: %b\nstr1.equals(str3): %b",goku == gohan, goku == vegeta, goku.equals(vegeta));

        
        // Close the Scanner object
        scanner.close();
    //}
    }
}
