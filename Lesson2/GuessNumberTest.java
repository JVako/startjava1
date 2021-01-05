import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 enter your name");
        Player player1 = new Player(scan.nextLine());
        System.out.println("Player 2 enter your name");
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            guessNumber.generateNumber();
            while (true) {
            System.out.println("Player 1 enter number");
            guessNumber.startGame(player1.getNumber());
            System.out.println("Player 2 enter number");
            guessNumber.startGame(player2.getNumber());
            }
        } while (!GuessNumberTest.isNext());
    }

    private static boolean isNext() {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Are you want to continue?");
            answer = scan.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
