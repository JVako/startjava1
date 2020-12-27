import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);
    Player player1 = new Player(scan.nextLine());
    Player player2 = new Player(scan.nextLine());
    GuessNumber guessNumber = new GuessNumber(player1, player2);
    GuessNumberTest guessNumberTest = new GuessNumberTest();
    int numberObj1 = player1.getNumber();

    public static void main(String[] args) {
        do {
            System.out.println("Player 1 enter your name");
            GuessNumberTest.enterName();
            System.out.println("Player 2 enter your name");
            GuessNumberTest.enterName();
            GuessNumber.generateNumber();
            while (true) {
                System.out.println("1 player enter number");
                GuessNumber.enterNumberPlayer();
                GuessNumberTest.checkEnterNumber();
                System.out.println("2 player enter number");
                GuessNumber.enterNumberPlayer();
                GuessNumberTest.checkEnterNumber();
            }
        }
        while (GuessNumberTest.wantContinue());
    }

    public static void enterName() {
        Scanner scan = new Scanner(System.in);
        String nameScanPlayer = scan.nextLine();
        System.out.println("Welcome " + nameScanPlayer);
    }

    public static void checkEnterNumber() {
        Scanner scan = new Scanner(System.in);
        do {
            if (GuessNumber.playerNumber < GuessNumber.computerNumber) {
                System.out.println("Player entered number < the number of computer");
            } else if (GuessNumber.playerNumber > GuessNumber.computerNumber) {
                System.out.println("Player entered number > the number of computer");
            } else if (GuessNumber.playerNumber == GuessNumber.computerNumber) {
                System.out.println("Yes! Right! You guessed the number! This is number " + GuessNumber.playerNumber + " !");
                scan.nextInt();
                break;
            }
        } while (!true);
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

