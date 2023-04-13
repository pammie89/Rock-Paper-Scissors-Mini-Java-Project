public class Game {

    //This is essentially handling the games logic.

    //two provide instances for player1 & player2
    private Player player1;
    private Player player2;

    //This is the constructor which takes two player arguments.
    public Game (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //This play method will handle each round of the game.
    public void play() {
        //It calls on the makeMove method here for player 1 & 2.
        String p1Move = player1.makeMove();
        String p2Move = player2.makeMove();

        //Here it is getting printed to the console.
        System.out.println("Player 1: " + p1Move);
        System.out.println("Player 2: " + p2Move);

        int result = getResult(p1Move, p2Move);
        //This if else statement displays the suitable outcome of the game (win or tie).
        if(result == 0) {
            System.out.println("It is a tie game!");
        } else if (result == 1) {
            System.out.println("Player 1 is the winner!");
            player1.incrementPoints();
        } else {
            System.out.println("Player 2 is the winner!");
            player2.incrementPoints();
        }
    }

    //This method takes players moves as arguments to determine the winner.
    private int getResult(String p1Move, String p2Move) {
        if(p1Move.equals(p2Move)) {
            // O means a tie
            return 0;
        }else if (p1Move.equals("rock")) {
            //it will return 2 or 1 depending on what player inputs
            return (p2Move.equals("paper")) ? 2 : 1;
        } else if (p1Move.equals(("paper"))) {
            //Same here
            return (p2Move.equals("scissors")) ? 2 : 1;
        }else {
            //and here.
            return (p2Move.equals("rock")) ? 2 : 1;
        }
    }

}
