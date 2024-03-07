package Player;
import Card.Card;

import java.util.ArrayList;

public class Hand{
    private ArrayList<Card> cards = new ArrayList<Card>();

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
     * This method will be used to clear the player and dealer's
     * hand after each round.
     */
    public void removeAllCards() {
        cards.clear();
    }

}
