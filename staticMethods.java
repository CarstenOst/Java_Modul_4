import java.util.Random;

public class staticMethods {
    // Just a demo of static methods -> this returns a random number from maxNum to minNum
    public static int randomNr(int maxNum, int minNum) {
        int randomNumber = new Random().nextInt(maxNum - minNum + 1) + minNum;
        return randomNumber;
    }
}
