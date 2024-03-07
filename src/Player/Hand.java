package Player;
import Card.Card;
import java.util.ArrayList;

public class Hand{
    private ArrayList<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Method to tally up the player and dealer's hands.
     * @return The total value in their hand.
     */
    public int getHandTotal() {
        int total = 0;
        for(Card card: cards) {
            total += card.getValue();
        }
        return total;
    }

    /**
     * This method clears out the hands of either player.
     * Used when the initial game loop has concluded.
     */
    public void removeAllCards() {
        cards.clear();
    }

    /**
     * Only show the first dealers card and use variable x for hidden cards.
     */
    public void getDealerVisibleHand() {
        System.out.println(cards.get(0).toString() + " X(X)");
    }

    @Override
    public String toString() {
        StringBuilder hand = new StringBuilder();
        for(Card card: cards) {
            hand.append(card.toString() + " ");
        }
        return "hand: " + hand;
    }

}
