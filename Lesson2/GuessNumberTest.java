import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);
    Player player1 = new Player(scan.nextLine());
    Player player2 = new Player(scan.nextLine());

    String nameScanPlayer1 = player1.getName();
    String nameScanPlayer2 = player2.getName();

    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scan = new Scanner(System.in);
        GuessNumber guessNumber1 = new GuessNumber(scan.nextInt());
        GuessNumberTest guessNumberTest1 = new GuessNumberTest();
        scan.nextLine();
        do {
            guessNumberTest1.enterName();
            guessNumber1.generateNumber();
            while (true) {
                guessNumber1.enterNumberPlayer1();
                guessNumber1.enterNumberPlayer2();
            }
        }
        while (guessNumberTest1.wantContinue());
    }

    public void enterName() {
        System.out.println("Enter the name of 1 player ");
        nameScanPlayer1 = scan.nextLine();
        System.out.println("Welcome " + nameScanPlayer1 + ". This is 1 player.");
        System.out.println("Enter the name of 2 player ");
        nameScanPlayer2 = scan.nextLine();
        System.out.println("Welcome " + nameScanPlayer2 + ". This is 2 player.");
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

