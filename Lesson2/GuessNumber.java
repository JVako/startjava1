import java.util.Scanner;

public class GuessNumber {

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

    public void enterNumberPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 enter number");
        player1.setNumber(scan.nextInt());
        checkEnterNumber(player1.getNumber());
        System.out.println("Player 2 enter number");
        player2.setNumber(scan.nextInt());
        checkEnterNumber(player2.getNumber());
    }

    public static void checkEnterNumber(int checkNumber) {
        Scanner scan = new Scanner(System.in);
        do {
            if (checkNumber < computerNumber) {
                System.out.println("Player entered number < the number of computer");
            } else if (checkNumber > computerNumber) {
                System.out.println("Player entered number > the number of computer");
            } else if (checkNumber == computerNumber) {
                System.out.println("Yes! Right! You guessed the number!");
                scan.nextInt();
                break;
            }
        } while (!true);
    }
}

