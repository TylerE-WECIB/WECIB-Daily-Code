//java is weird and i can't multiply a string. there is definitely a way but nah imma do my own thing
//printf prints without newlines. java is also weird and the newline input is %n instead of \n
//get number of rows then for loop printf(" ") n times and printf("the thing")
//increase n from 0 to rows-1
//can't printf a character i guess
//do print instead of printf for the loop cause printf uses % as an important symbol

import java.util.Scanner;


public class Stairs{
    public static void main(String[] args){
        System.out.println("Welcome to the staircase dimension!");
        Scanner userInput = new Scanner(System.in);
        System.out.printf("How many rows do you want? ");
        int numRows = userInput.nextInt();
        userInput.nextLine(); //if i don't put this then the second input call gets skipped because I hit enter. Thanks stackoverflow
        System.out.printf("What are the stairs made of? ");
        char stairText = userInput.next().charAt(0); //java doesn't have nextchar. i have to do this apparently. thanks geeksforgeeks
        System.out.printf("Printing...%n%n");
        
        for(int currentRow = numRows; currentRow > 0; currentRow--){
            for(int numSpaces = 0; numSpaces < currentRow - 1; numSpaces++){
                System.out.print(" ");
            }
            for(int remainingText = numRows + 1 - currentRow; remainingText > 0; remainingText --){
                System.out.print(stairText);
            }
            System.out.println("");
            
        }
        System.out.println("");
        System.out.println("Done!");
    }
}