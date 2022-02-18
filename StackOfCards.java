import java.util.Random;

public class StackOfCards {

    // Fields
    private int maxCards;
    private Card[] kortStokk;

    // Constructor
    public StackOfCards() {
        maxCards = 52;
        createNormalDeck();
    }

    // Method to make a normal/common deck
    public void createNormalDeck(){
        kortStokk = new Card[maxCards];
        String[] symbol = new String[] {"spar", "hjerter", "kløver", "ruter"};

        int totalNumberOfCardsCreated = 0;
        for (String s : symbol) {
            for (int i = 1;i <= maxCards / symbol.length; i++) {
                kortStokk[totalNumberOfCardsCreated++] = new Card(i, s);
            }
        }
    }

    // Method to print stack of cards
    public void printStackOfCards(){
        for (Card kort : kortStokk) {
            System.out.println(kort.getSymbol() + " " + kort.getValue());
        }
    }

    // Meth... Who am I even commenting for?
    public void cardShuffle(int numberOfShuffles){
        // Since java version 10, it is no longer needed to use Random variabelNavn = new Random() -> var variabelNavn = new Random() (locally)
        if (numberOfShuffles >= 1){
            String variabel = "kake";
            for (int b = 0;b < numberOfShuffles; b++){
                // Random number of shuffles from some number in the parameter
                int rndCardShuffles = rndAmountOfCardShuffles(40, 200); // from to number
                for (int i = 0; i < rndCardShuffles; i++){
                    // Random numbers
                    int rnd = randomNr(maxCards);
                    int rnd1 = randomNr(maxCards);
                    // Checks if the numbers are not the same, and will then execute card shuffle
                    if (rnd != rnd1){
                        Card tempKort = kortStokk[rnd];
                        kortStokk[rnd] = kortStokk[rnd1];
                        kortStokk[rnd1] = tempKort;
                        //System.out.println("Bytter " + kortStokk[rnd].getSymbol() + " " + kortStokk[rnd].getValue() + " med " + kortStokk[rnd1].getSymbol() + " " + kortStokk[rnd1].getValue());
                    }
                }
            }
        }
    }


    private int rndAmountOfCardShuffles(int minCardShuffles, int maxCardShuffles){
        // Pseudo-random number from minCards to maxCards

        int rndCardShuffles = staticMethods.randomNr(maxCardShuffles, minCardShuffles); // Demo av static metode

        System.out.println("Number of individual card swaps: " + rndCardShuffles);
        return rndCardShuffles;
    }


    private int randomNr(int maxNum) {
        int randomNumber = new Random().nextInt(maxNum); // Will start from 0 -> maxNum - 1 (Perfect for arrays)
        return randomNumber;
    }
}
