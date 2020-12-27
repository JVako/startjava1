import java.util.Scanner;

public class GuessNumber {
    public static int playerNumber;
    public static int computerNumber;
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public static void generateNumber() {
        computerNumber = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + computerNumber);
    }

    public static void enterNumberPlayer() {
        Scanner scan = new Scanner(System.in);
        playerNumber = (scan.nextInt());
    }
}
