import java.util.ArrayList;
import java.util.Date;

public class GameHistory {
    private ArrayList<GameResult> history;

    public GameHistory() {
        this.history = new ArrayList<GameResult>();
    }

    public void addGameResult(GameResult result) {
        this.history.add(result);
    }

    public void printHistory() {
        System.out.println("GAME HISTORY");
        System.out.println("------------");
        for (GameResult result : this.history) {
            System.out.println(result.toString());
        }
    }
}

class GameResult {
    private String winnerName;
    private Date date;

    public GameResult(String winnerName) {
        this.winnerName = winnerName;
        this.date = new Date();
    }

    public String toString() {
        return "Winner: " + this.winnerName + ", Date: " + this.date.toString();
    }
}
