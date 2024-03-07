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
     * This method will be used to clear the player and dealer's
     * hand after each round.
     */
    public void removeAllCards() {
        cards.clear();
    }

    public void getDealerVisibleHand() {
        System.out.println(cards.get(0).toString() + " X(X)");
    }

    @Override
    public String toString() {
        StringBuilder hand = new StringBuilder();
        for(Card card: cards) {
            hand.append(card.toString() + " ");
        }
        return "hand: " + hand.toString();
    }

}
