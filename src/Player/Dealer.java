package Player;

public class Dealer extends Player {

    /**
     * This method tells the game if the dealer should keep hitting
     * or if he should stay by comparing the hand total with the
     * value 17.
     * @return The value indicating if he should keep drawing cards.
     */
    public boolean shouldHit() {
        return getHand().getHandTotal() < 17;
    }

    public void getVisibleHand() {
        getHand().getDealerVisibleHand();
    }
}
