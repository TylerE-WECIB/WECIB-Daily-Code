import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        countdown();
    }

    static void countdown(){
        Scanner intScanner = new Scanner(System.in); //scanner object that will read the int the user types
        System.out.print("Type in an integer and I will count down from it:  ");
        int userInt = 0; //starting integer. this is a safe starting value because you can't count down from 0
        try { //error handling
            userInt = intScanner.nextInt();
        } catch (Exception e) { //idk why exception is e and not just Exception like in python but that's the default syntax and maybe e needs to be created as an object of Exception because everything's a class?
            System.out.println("That wasn't an integer how am I supposed to count down from that dude that's really uncool of you.");
        }
        System.out.println();
        for(int i = userInt; i > 0; i--){ //i gets set to the starting integer and goes down by 1 every loop until it equals 0.
            System.out.println(i); //prints i on a newline every loop
        }
        intScanner.close(); //closes the scanner to prevent memory leaks
    }
}