import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BlackJackGame game = new BlackJackGame();

        String menu = "Hello and welcome to BlackJack!\n" +
                "Please select an option:\n" +
                "1. Play BlackJack\n" +
                "2. Quit";
        boolean quit = false;
        while(!quit) {
            System.out.println(menu);
            int choice = kb.nextInt();
            kb.nextLine();

            switch(choice) {
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
        }
        kb.close();
        System.exit(0);
    }
}