package Player;
import Card.Card;

public class Player {
    Hand hand;
    public Player() {
        hand = new Hand();
    }

    /**
     * Method for when a player requests a new card.
     * @param card: The card to be added to the player's hand.
     */
    public void hit(Card card) {
        hand.addCard(card);
    }

    public Hand getHand() {
        return this.hand;
    }

    /**
     * Function to remove all cards from a hand.
     * Used for both dealer and player after each hand has completed.
     */
    public void clearHand() {
        hand.removeAllCards();
    }

}
