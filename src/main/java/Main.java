import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner object reads the user input
        Scanner scanner = new Scanner(System.in);
    //These are the inital options the player will have to choose from.
        while (true) {
            System.out.println("How would you like to play?");
            System.out.println("Option #1: 2 Player Game");
            System.out.println("Option #2: Play against Computer");
            System.out.println("Option #3: Exit Game");
            // This line await for the users input.
            // It also stopped the while loop above from looping.
            int option = scanner.nextInt();
            scanner.nextLine();
//continuing with HuamnPlayer & computerPlayer pages
        }
    }
}
