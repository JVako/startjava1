import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        GuessNumber game = new GuessNumber("p1", "p2");
        do {
            guessNumberTest.enterName();
            GuessNumber.play();
        } while (guessNumberTest.wantContinue());
    }

    public void enterName() {
        System.out.println("Enter the name of 1 player");
        player1.scan.nextLine();
        System.out.println("Enter the name of 2 player");
        player2.scan.nextLine();
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

