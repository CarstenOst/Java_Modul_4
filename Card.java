public class Card {

    // Fields
    private final int value;
    final private String symbol;

    // Constructor
    public Card(int value, String symbol) {
        this.symbol = symbol;
        this.value = value;
    }

    // Only getters beyond this point
    public int getValue()
    {
        return value;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void printSelf(){
        System.out.println("This card is " + symbol + " " + value);
    }

    // no need for a setter, as a card is not allowed to change value or symbol
    // also in this instance variables could easily be public without any security risk, as they are final,
    // but if we want to make it into a game, then the having the variables private is just fine
}
