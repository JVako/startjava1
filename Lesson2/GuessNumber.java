import java.util.Scanner;

public class GuessNumber {

    public GuessNumber(String p1, String p2) {
    }

    public static void play() {
        Scanner scan = new Scanner(System.in);
        int game = (int) (Math.random() * 101);
        System.out.println("The number of computer " + game);
        System.out.println("Great! Player 1 enter a number! ");
        do {
            int enterNumber = scan.nextInt();
            if (enterNumber < game) {
                System.out.println("Player entered number < the number of computer");
                System.out.println("The next player to enter the number!");
            } else if (enterNumber > game) {
                System.out.println("Player entered number > the number of computer");
                System.out.println("The next player to enter the number!");
            } else if (enterNumber == game) {
                System.out.println("Yes! Player guessed the number! = " + game);
                break;
            }
        } while (true);
    }
}

