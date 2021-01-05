import java.util.Scanner;

public class GuessNumber {
    private static int randomNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void generateNumber() {
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
    }

    public void startGame() {
        Scanner scan = new Scanner(System.in);
        int playNumber1, playNumber2;
        generateNumber();
        do {
            System.out.println("Player 1 enter number");
            playNumber1 = scan.nextInt();
            System.out.println("Player 2 enter number");
            playNumber2 = scan.nextInt();
            if (playNumber1 == randomNum) {
                System.out.println("Yes! Right! Player 1 guessed the number");
                break;
            }
            if (playNumber2 == randomNum) {
                System.out.println("Yes! Right! Player 2 guessed the number");
                break;
            } else {
                System.out.println("Try again. No one guessed number");
            }
        } while (true);
    }
}


