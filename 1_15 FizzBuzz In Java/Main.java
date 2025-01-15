// aw yeah this is happenin
public class Main
{
    public static void main(String[] args) {
        int three = 3;
        int five = 5;
        int fifteen = 15;
        int one = 1;
        
        //fizzbuzz logic for three variable
        if (three % 15 == 0){
            System.out.println("fizzbuzz");
        } else if (three % 3 == 0){
            System.out.println("fizz");
        } else if (three % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println("not fizz or buzz this is a weird number");
        }
        
        //fizzbuzz logic for five variable
        if (five % 15 == 0){
            System.out.println("fizzbuzz");
        } else if (five % 3 == 0){
            System.out.println("fizz");
        } else if (five % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println("not fizz or buzz this is a weird number");
        }
        
        //fizzbuzz logic for fifteen variable
        if (fifteen % 15 == 0){
            System.out.println("fizzbuzz");
        } else if (fifteen % 3 == 0){
            System.out.println("fizz");
        } else if (fifteen % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println("not fizz or buzz this is a weird number");
        }
        
        //fizzbuzz logic for one variable
        if (one % 15 == 0){
            System.out.println("fizzbuzz");
        } else if (one % 3 == 0){
            System.out.println("fizz");
        } else if (one % 5 == 0){
            System.out.println("buzz");
        } else {
            System.out.println("not fizz or buzz this is a weird number");
        }
    }
}