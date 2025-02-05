public class ThreeIsNotTheMagicNumber{
    public static void main(String[] args) {
        // BEGIN

        // Loop through numbers 1 to 20
        // FOR each number from 1 to 20 DO
        //     IF number is divisible by 3 THEN
        //         Skip this iteration
        //     ELSE
        //         Print the number
        //     END IF
        // END FOR

        // END

        for(int i = 1; i <= 20; i++){ //loop iterates from 1 to 20 inclusive
            if(i % 3 == 0){
                continue; //vs code says this is unnecessary. only printing i if i % 3 != 0 seems to have the same output *shrug emoji*
            }else{
                System.out.println(i);
            }
        }
    }
}


