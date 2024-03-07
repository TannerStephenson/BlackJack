package Player;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner kb;
    int chips;
    public HumanPlayer() {
        super();
        kb = new Scanner(System.in);
        chips = 200;
    }

    public int getChips() {
        return this.chips;
    }

    public void playerWins() {
        this.chips += 10;
        System.out.println("You win 10 chips!");
    }

    public void playerBusts() {
        this.chips -= 10;
        System.out.println("Bust! You lose 10 chips!");
    }

    public void playerLoses() {
        this.chips -= 10;
        System.out.println("Dealer wins! You lose 10 chips!");
    }

    /**
     * Method that waits for player to choose if
     * they want to hit or stay.
     * @return a boolean that indicates if we should keep adding to the hand or not.
     */
    public boolean wantToHit(){
        int choice = 0;
        boolean validInput = false;

        while(!validInput) {
            System.out.println("Would you like to hit or stay?\n1.Hit\n2.Stay");
            String input = kb.nextLine();

            try {
                choice = Integer.parseInt(input);
                if (choice == 1 || choice == 2) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter 1 to hit or 2 to stay.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        if(choice == 1) {
            return true;
        }
        return false;
    }
}
