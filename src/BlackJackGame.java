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
        
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
        player.hit(deck.dealCard());
        dealer.hit(deck.dealCard());
    }
    public void playRound() {

    }
}
