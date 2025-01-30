import java.text.MessageFormat;
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a whole number: ");
        String finalVal = factorial(input.nextInt());
        System.out.println(finalVal);
        input.close();
    }

    public static String factorial(long number){
        //Planning
        //take user input number. use for loop to start at that number and decrease by 1 until 0
        //repeatedly multiply a starting number by the index of the loop

        if(number < 0){
            return MessageFormat.format("The factorial of {0} is undefined.",number);  //woah string formatting. also you cant have a factorial less than 0 because math
        }else{
        long factNum = 1;
        for (long indexNum = number; indexNum > 0; indexNum--) {
            if((factNum * indexNum) <= 0){
                return MessageFormat.format("The factorial of {0} is a really big number. (Overflow Error)",number); //overflow handling. if it becomes negative then java goofed up
            }
            factNum *= indexNum;
        }
        return MessageFormat.format("The factorial of {0} is {1}.",number,factNum); //successful output
    }
}
}