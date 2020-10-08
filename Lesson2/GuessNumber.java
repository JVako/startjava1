import java.util.Scanner;

public class GuessNumber {
    public static void gamePlay() {
        Scanner scan = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 101);
        Player player1 = new Player("Kate", 0);
        Player player2 = new Player("Mary", 0);

        System.out.println("Great! Player 1 is " + player1.name + " enter a number > " + player1.number);
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
                System.out.println("Player 1 " + player1.name + ". Thank you for your time!");
                System.out.println("Player 2 " + player2.name + ". Thank you for your time!");
                break;
            }
        } while (true);
    }
}
