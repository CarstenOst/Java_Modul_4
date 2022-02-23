import java.util.ArrayList;
import java.util.Iterator;
public class DeckOfCardsArrayList {
    // Fields
    final private int maxCards;
    private ArrayList<Card> kortStokk;
    final private String[] valoer;

    public DeckOfCardsArrayList() {
         maxCards = 52;
         kortStokk = new ArrayList<>();
         valoer = new String[] {"Kloever", "Hjerter", "Ruter", "Spar"};
         createDeck();
    }


    private void createDeck(){
        for (String v : valoer) {
            for (int i = 1; i <= maxCards / valoer.length; ++i) {
                kortStokk.add(new Card(i,v));
            }
        }
    }


    public void printDeck(){
        for (Card kort : kortStokk){ // for-each
            System.out.println(kort.getSymbol() + " " + kort.getValue());
        }
    }


    public void printDeckLessFun(){
        for (int i = 0; i < kortStokk.size(); i++){
            System.out.println(kortStokk.get(i).getSymbol() + " " + kortStokk.get(i).getValue());
        }
    }


    public void removeCard(int value){
        Iterator<Card> kort = kortStokk.iterator();
        while (kort.hasNext()){
            Card currentCard = kort.next();
            if (currentCard.getValue() == value) {
                kort.remove();
            }
        }
    }


    public ArrayList<Card> getKortStokk(){
        return kortStokk;
    }
}
