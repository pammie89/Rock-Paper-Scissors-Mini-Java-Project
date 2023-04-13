import java.util.Scanner;

//This HumanPlayer class extends from Player and represents a player in the game
public class HumanPlayer extends Player {
    private Scanner scanner;

    //This is the constructor and takes scanner object as its argument.
    public HumanPlayer(Scanner scanner) {
        super();
        //this assigns the scanner to the scanner instance variable.
        this.scanner = scanner;
    }

    //Overriding the superclass of makeMove (found in the Player.java file)
    @Override
    public String makeMove() {
        //The game is asking which selection the player would like to make
        System.out.println("Which would you like to select? (rock, paper, scissors): ");
        //it is setting the input to read in all lowercase
        String move = scanner.nextLine().toLowerCase();
        while (!isValidMove(move)) {
            //player sees this if they enter anything other than paper, rock, scissors.
            System.out.println("Invalid selection. Please enter rock, paper, or scissors (as your answer): ");
            //it is setting the input to read in all lowercase
            move = scanner.nextLine().toLowerCase();
        }
        //reads the input and returns the result to the move variable.
        setMove(move);
        //returns player move
        return move;
    }
//private helper method that takes string argument of move.
    private boolean isValidMove(String move) {
        //returns true if any of the below inputs are valid moves.
        return move.equals("rock") || move.equals("paper") || move.equals("scissors");
    }
}
