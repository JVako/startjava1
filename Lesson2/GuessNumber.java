import java.util.Scanner;

public class GuessNumber {

    private static int randomNum;
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void generateNumber() {
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
    }

    public void startGame(int number) {
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        do {
            if (number < randomNum) {
                System.out.println("Player entered number < the number of computer");
            } else if (number > randomNum) {
                System.out.println("Player entered number > the number of computer");
            } else if (number == randomNum) {
                System.out.println("Yes! Right! You guessed the number!");
                scan.nextInt();
                break;
            }
        } while (number == randomNum);
    }
}
