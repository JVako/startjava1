import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player(scan.nextLine());
        Player player2 = new Player(scan.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2);
        do {
            System.out.println("Player 1 enter your name");
            player1.setName(scan.nextLine());
            System.out.println("Player 2 enter your name");
            player2.setName(scan.nextLine());
            GuessNumber.generateNumber();
            while (true) {
                guessNumber.enterNumberPlayer();
            }
        } while (GuessNumberTest.wantContinue());
    }

    public static boolean wantContinue() {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Are you want to continue?");
            answer = scan.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}

