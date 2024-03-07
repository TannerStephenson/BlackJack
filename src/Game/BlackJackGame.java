package Game;
import Card.Deck;
import Player.Dealer;
import Player.HumanPlayer;

public class BlackJackGame {
    private Deck deck;
    private HumanPlayer player;
    private Dealer dealer;

    public BlackJackGame() {
        deck = new Deck();
        player = new HumanPlayer();
        dealer = new Dealer();
    }

    /**
     * This method is called at the beginning of every round.
     * Used to give the player and dealer their initial cards.
     */
    private void initialDeal(){
        player.clearHand();
        dealer.clearHand();
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
    }

    /**
     * This method handles the main game loop.
     * Used every time a new round is started.
     */
    public void playRound() {
        System.out.println("------------------------------------");
        // Print out the initial hands and deal the cards.
        System.out.println("You have " + player.getChips() + " chips.");
        initialDeal();
        printHiddenHands();
        // Human player's turn.
        while(player.wantToHit()) {
            player.hit(deck.dealCard());
            printHiddenHands();
            // Check if the player has exceeded 21.
            if(player.getHand().getHandTotal() > 21) {
                player.playerBusts();
                System.out.println("------------------------------------");
                return;
            }
        }
        System.out.println();
        // Determine if the dealer should play. If initially no, print hands before determining the winner.
        if(dealer.shouldHit()) {
            while (dealer.shouldHit()) {
                dealer.hit(deck.dealCard());
                System.out.println();
                printHands();
                // Check if the dealer has exceeded 21.
                if (dealer.getHand().getHandTotal() > 21) {
                    player.playerWins();
                    System.out.println("------------------------------------");
                    return;
                }
            }
        } else {
            printHands();
        }
        System.out.println();
        determineWinner();
        System.out.println("------------------------------------");
    }

    /**
     * This method prints out the dealer's visible hand.
     * Used only when the dealer is waiting for player to finish their turn.
     */
    private void printHiddenHands() {
        System.out.print("Dealer's ");
        dealer.getVisibleHand();
        System.out.println("Player's " + player.getHand());
        System.out.println("Your hand total: " + player.getHand().getHandTotal());
    }

    /**
     * This method reveals all cards, including the dealer's hidden hands.
     * Used only when the player has finished their turn.
     */
    private void printHands() {
        System.out.println("Dealers " + dealer.getHand());
        System.out.println("Player's " + player.getHand());
        System.out.print("Your hand total: " + player.getHand().getHandTotal());
        System.out.print("\nDealer's hand total: " + dealer.getHand().getHandTotal() + "\n");
    }

    /**
     * This method takes each player's hand total and compares them together.
     * Used when the dealer and player have both stopped playing, we can determine the results.
     */
    private void determineWinner() {
        int playerTotal = player.getHand().getHandTotal();
        int dealerTotal = dealer.getHand().getHandTotal();

        if(playerTotal == dealerTotal) {
            System.out.println("Push! Nothing lost and nothing gained.");
        } else if(playerTotal > dealerTotal) {
            player.playerWins();
        } else {
            player.playerLoses();
        }
    }
}
