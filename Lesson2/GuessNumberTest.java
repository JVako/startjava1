import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();
    String nameScanPlayer1 = player1.getName();
    String nameScanPlayer2 = player2.getName();
    int numberScanPlayer1 = player1.getNumber();
    int numberScanPlayer2 = player2.getNumber();
    int numberGenerate = GuessNumber.generateNumber();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        GuessNumber guessNumber = new GuessNumber(GuessNumber.generateNumber());
        do {
            guessNumberTest.enterName();
            while (true) {
                guessNumberTest.enterNumberPlayer1();
                guessNumberTest.enterNumberPlayer2();
            }
        } while (guessNumberTest.wantContinue());
    }

    public void enterName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of 1 player ");
        nameScanPlayer1 = scan.nextLine();
        System.out.println("Welcome " + nameScanPlayer1 + ". This is 1 player.");
        System.out.println("Enter the name of 2 player ");
        nameScanPlayer2 = scan.nextLine();
        System.out.println("Welcome " + nameScanPlayer2 + ". This is 2 player.");
    }

    public void enterNumberPlayer1() {
        do {
            System.out.println("GENERATE NUMBER " + numberGenerate);
            System.out.println(nameScanPlayer1 + " - 1 player enter number.");
            numberScanPlayer1 = scan.nextInt();
            if (numberScanPlayer1 < numberGenerate) {
                System.out.println("Player 1 entered number < the number of computer.");
            } else if (numberScanPlayer1 > numberGenerate) {
                System.out.println("Player 1 entered number > the number of computer");
            } else if (numberScanPlayer1 == numberGenerate) {
                System.out.println("Yes! Right! Player1 " + numberScanPlayer1 + " You guessed the number!");
                break;
            }
        } while (!true);
    }

    public void enterNumberPlayer2() {
        do {
            System.out.println("GENERATE NUMBER " + numberGenerate);
            System.out.println(nameScanPlayer2 + " - 2 player enter number.");
            numberScanPlayer2 = scan.nextInt();
            if (numberScanPlayer2 < numberGenerate) {
                System.out.println("Player 2 entered number < the number of computer.");
            } else if (numberScanPlayer2 > numberGenerate) {
                System.out.println("Player 2 entered number > the number of computer");
            } else if (numberScanPlayer2 == numberGenerate) {
                System.out.println("Yes! Right! Player2 " + numberScanPlayer2 + " You guessed the number!");
                break;
            }
        } while (!true);
    }

    public boolean wantContinue() {
        boolean runAction = true;
        String answer = " ";
        do {
            System.out.println("Are you want to continue?");
            answer = scan.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
