import java.util.Scanner;

public class GuessNumber {
    public static void gamePlay() {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();
        int guessNumber = (int) (Math.random() * 101);
        System.out.println("The number of computer " + guessNumber);
        System.out.println("Great! Player 1 enter a number! ");
        do {
            int enterNumber = scan.nextInt();
            if (enterNumber < guessNumber) {
                System.out.println("Player entered number < the number of computer");
                System.out.println("The next player to enter the number!");
            } else if (enterNumber > guessNumber) {
                System.out.println("Player entered number > the number of computer");
                System.out.println("The next player to enter the number!");
            } else if (enterNumber == guessNumber) {
                System.out.println("Yes! Player guessed the number! = " + guessNumber);
                System.out.println("Player 1 ! Thank you for your time! ");
                System.out.println("Player 2 ! Thank you for your time! ");
                break;
            }
        } while (true);
    }
}

