import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner intScanner = new Scanner(System.in); //scanner object that will read the int the user types
        System.out.print("Type in an integer and I will count down from it:  ");
        int userInt = 0; //starting integer. this is a safe starting value because you can't count down from 0
        try {
            userInt = intScanner.nextInt();
        } catch (Exception e) {
            System.out.println("That wasn't an integer how am I supposed to count down from that dude that's really uncool of you.");
        }
        System.out.println();
        for(int i = userInt; i > 0; i--){ //i gets set to the starting integer and goes down by 1 every loop until it equals 0.
            System.out.println(i); //prints i on a newline every loop
        }
        intScanner.close(); //closes the scanner to prevent memory leaks
    }
}