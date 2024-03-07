package Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    /**
     * This method will add all the cards to the deck in the start of the game
     * or in the case where we have run out of cards.
     */
    private void initializeDeck() {
        char[] suits = {'H', 'D', 'C', 'S'};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        // Loop through the suits adding each to the deck.
        for(char suit: suits) {
            for(String rank: ranks) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Method that will be used whenever game requests a card.
     * @return The card dealt from the deck.
     */
    public Card dealCard(){
        // Check if we need to initialize a new deck.
        if(deck.isEmpty()){
            initializeDeck();
        }
        return deck.remove(0);
    }

    /**
     * Use java's built in collections shuffle method to randomize our deck.
     */
    private void shuffleDeck() {
        Collections.shuffle(deck);
    }
}
