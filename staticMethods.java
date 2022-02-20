import java.util.ArrayList;
import java.util.Random;

public class staticMethods {
    // Just a demo of static methods -> this returns a random number from maxNum to minNum
    public static int randomNr(int maxNum, int minNum) {
        return new Random().nextInt(maxNum - minNum + 1) + minNum;
    }

    public static void printCardArrayList(ArrayList<Card> arr){
        for (Card kort : arr){
            kort.printSelf();
        }
    }
}
