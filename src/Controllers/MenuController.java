package Controllers;
import Game.BlackJackGame;
import java.util.Scanner;

public class MenuController {
    /**
     * Controls the main menu of the game, allowing players to choose between playing the game or exiting.
     * Initializes a new game and manages user input for menu options.
     */
    public void mainMenuController() {
        // Initialize a new game.
        BlackJackGame game = new BlackJackGame();
        System.out.println("Hello and welcome to BlackJack!");
        // Read from the keyboard.
        Scanner kb = new Scanner(System.in);
        String menu =
                "Please select an option:\n" +
                        "1. Play BlackJack\n" +
                        "2. Quit";

        // Main game loop.
        boolean quit = false;
        while(!quit) {
            System.out.println(menu);
            try {
                int choice = kb.nextInt();
                kb.nextLine();

                switch (choice) {
                    case 1:
                        game.playRound();
                        break;
                    case 2:
                        quit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please select either 1 or 2.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                kb.nextLine();
            }
        }
        kb.close();
        System.exit(0);
    }
}
