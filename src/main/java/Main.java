import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner object reads the user input
        Scanner scanner = new Scanner(System.in);
    //These are the inital options the player will have to choose from.
        while (true) {
            System.out.println("SELECT YOUR GAME PLAY MODE?");
            System.out.println("//////////////////////////");
            System.out.println("(1) - Two Player Game");
            System.out.println("(2) - Play against Computer");
            System.out.println("(3) - Exit Game");
            System.out.println("ENTER NUMBER BELOW");
            // This line await for the users input.
           int option = scanner.nextInt();
            scanner.nextLine();
            //Checks if player selects option 1, which is to play against another player
            if (option == 1) {
                Player player1 = new HumanPlayer(scanner);
                Player player2 = new HumanPlayer(scanner);
                Game game = new Game(player1, player2);
                playGame(game, scanner);
            //Checks if the player selects option 2, which is to play against the computer
            } else if (option == 2) {
                Player player1 = new HumanPlayer(scanner);
                Player player2 = new ComputerPlayer();
                Game game = new Game(player1, player2);
                playGame(game, scanner);
            //checks if the player wants to exit the game.
            } else if (option == 3) {
                System.out.println("Thank you for playing!");
                break;

            //This presents itself if they enter their option incorrectly.
            } else {
                System.out.println("Invalid option selected.  Please choose again. Use only numbers.");
            }
        }

        scanner.close();
    }

    //PlayGame method which takes two arguments - game & scanner
    private static void playGame(Game game, Scanner scanner) {
        //starts a loop that asks if the player if they would like to play again.
        while (true) {
            game.play();
            System.out.println("Would you like to play again? (y/n): ");
            String input = scanner.nextLine().toLowerCase();
            //if the player enters an invalid entry this while loop will run.
            while (!isValidInput(input)) {
                System.out.println("Invalid entry.  Please enter y or n: ");
                input = scanner.nextLine().toLowerCase();
            }
            //Stops the game and exits to main menu if player selects "n".
            if (input.equals("n")) {
                break;
            }
        }
    }

    //This is a helper method that take a string and await y or n answers to continuing playing or quiting the game.
    private static boolean isValidInput(String input) {
        return input.equals("y") || input.equals("n");
    }
}
