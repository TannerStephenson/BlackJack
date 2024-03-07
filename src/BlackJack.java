import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BlackJackGame game = new BlackJackGame();
        System.out.println("Hello and welcome to BlackJack!");

        String menu =
                "Please select an option:\n" +
                "1. Play BlackJack\n" +
                "2. Quit";
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