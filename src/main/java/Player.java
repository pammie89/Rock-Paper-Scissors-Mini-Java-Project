public abstract class Player {

    //These are the instance variables
   private int points;
   private String move;

   //This is the constructor
   public Player() {
       points = 0;
   }

   //Below are the initial methods I believe the game will use.  This may change.

    //This method will increment player points.
    public void incrementPoints() {
       points++;
   }
    //This method contains an argument with a value of move
   public void setMove(String move) {
       this.move = move;
   }
    //This method returns the current value of move.
   public String getMove() {
       return move;
   }
    //This method returns the value of points.
   public int getPoints() {
       return points;
   }

   //This abstract method will initiate the makemove method
    public abstract String makeMove();


}
