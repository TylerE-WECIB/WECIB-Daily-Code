import java.util.Random;
public class TestDimension{
    static Random random = new Random();
    public static void main(String[] args) {
        // System.out.println(contains(new int[] { 1, 2, 3, 4}, 3));
        int[] numArray = generateNumbers();
        for(int i: numArray){
            System.out.println(i);
        }
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
        return randomNumbers;
    }
}