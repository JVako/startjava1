import java.util.Scanner;

public class GuessNumber {
    private static int randomNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
        int playNumber1, playNumber2;
        do {
            System.out.println("Player 1 enter number");
            playNumber1 = scan.nextInt();
            System.out.println("Player 2 enter number");
            playNumber2 = scan.nextInt();
            if (playNumber1 > randomNum) {
                System.out.println("Player 1 entered number > the number of computer");
            } else if (playNumber1 < randomNum) {
                System.out.println("Player 1 entered number < the number of computer");
            } else if (playNumber1 == randomNum) {
                System.out.println("Yes! Right! Player 1 guessed the number");
                break;
            }
            if (playNumber2 > randomNum) {
                System.out.println("Player 2 entered number > the number of computer");
            } else if (playNumber2 < randomNum) {
                System.out.println("Player 2 entered number < the number of computer");
            } else if (playNumber2 == randomNum) {
                System.out.println("Yes! Right! Player 2 guessed the number");
                break;
            } else {
                System.out.println("Try again. No one guessed number");
            }
        } while (true);
    }
}
