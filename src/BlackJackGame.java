import Card.Deck;
import Player.Dealer;
import Player.HumanPlayer;
import Player.Player;

public class BlackJackGame {
    private Deck deck;
    private HumanPlayer player;
    private Dealer dealer;

    public BlackJackGame() {
        deck = new Deck();
        player = new HumanPlayer();
        dealer = new Dealer();
    }

    private void initialDeal(){
        player.clearHand();
        dealer.clearHand();
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
    }
    public void playRound() {
        initialDeal();
        while(player.wantToHit()) {
            player.hit(deck.dealCard());
            if(player.getHand().getHandTotal() > 21) {
                player.playerBusts();
                return;
            }
        }
        while(dealer.shouldHit()) {
            dealer.hit(deck.dealCard());
            if(dealer.getHand().getHandTotal() > 21) {
                player.playerWins();
                return;
            }
        }
    }
}
