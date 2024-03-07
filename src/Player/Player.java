package Player;
import Card.Card;

import java.util.ArrayList;

public class Player {
    Hand hand;
    public Player() {
        hand = new Hand();
    }

    /**
     * Method for when a player requests a new hand.
     * @param card: The card to be added to the player's hand.
     */
    public void hit(Card card) {
        hand.addCard(card);
    }

    public Hand getHand() {
        return this.hand;
    }

}
