import java.util.Scanner;

public class GuessNumber {
    public static void gamePlay() {
        Scanner scan = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 101);
        System.out.println("Great! Player 1, enter number!");
        do {
            int enterNumber = scan.nextInt();
            if (enterNumber < guessNumber) {
                System.out.println("Player entered number < the number of computer" + guessNumber);
                System.out.println("The next player to enter the number!");
            } else if (enterNumber > guessNumber) {
                System.out.println("Player entered number > the number of computer");
                System.out.println("The next player to enter the number!");
            } else if (enterNumber == guessNumber) {
                System.out.println("Yes! Player guessed the number! = " + guessNumber);
                break;
            }
        } while (true);
    }
}
