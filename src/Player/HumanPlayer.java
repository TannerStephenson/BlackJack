package Player;

import java.util.Scanner;

public class HumanPlayer extends Player {
    Scanner kb;
    public HumanPlayer() {
        super();
        kb = new Scanner(System.in);
    }

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
