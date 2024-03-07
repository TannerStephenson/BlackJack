package Card;

public class Card {
    private char suit;
    // This will hold the representation of the card eg."K" or "7"
    private String rank;
    // This will hold the translated ranks value eg. "Q" is worth 10.
    private int value;

    Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        setValue(rank);
    }

    /**
     * This method is meant to translate our string values
     * into card values.
     * @param rank: The value that will need to be translated.
     */
    private void setValue(String rank) {
        switch (rank) {
            case "A":
                value = 11;
                break;
            case "K":
            case "Q":
            case "J":
                value = 10;
                break;
            default:
                value = Integer.parseInt(rank);
        }
    }

    /**
     * @return the value of the card.
     */
    public int getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return suit + "(" + getValue() + ")";
    }
}
