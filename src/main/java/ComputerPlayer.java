import java.util.Random;

//This ComputerPlayer is extending from Player
public class ComputerPlayer extends Player {


   //declares a private variable that can not be reassigned once initialized.
  private final Random random;

  //This is the constructor
  public ComputerPlayer() {
      super();
      random = new Random();
  }

  //Similar to the HumanPlayer @override, this override is generating a random move, which gets set to move
    //setMove is being inherited from Player and returning the move.
  @Override
    public String makeMove() {
      String[] moves = {"rock", "paper", "scissors"};
      int index = random.nextInt(moves.length);
      String move = moves[index];
      setMove(move);
      return move;
  }
}
