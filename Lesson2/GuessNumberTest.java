import java.util.Scanner;

public class GuessNumberTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        GuessNumber guessNumber = new GuessNumber();
        Player player = new Player();
        player.setNamePlayer("Bob");
        player.setEnterNumber(0);
        player.setNamePlayer("Mike");
        player.setEnterNumber(0);
        do {
            guessNumberTest.enterNameAndNumber();
            guessNumber.gamePlay();
        } while (guessNumberTest.wantContinue());
    }

    public void enterNameAndNumber() {
        String namePlayer = " ";
        int enterNumber = 0;
        scanner = new Scanner(System.in);
        System.out.println("Enter the name of 1 player");
        namePlayer = scanner.nextLine();
        System.out.println("Enter the name of 2 player");
        namePlayer = scanner.nextLine();
    }

    public boolean wantContinue() {
        scanner = new Scanner(System.in);
        boolean runAction = true;
        String answer = " ";
        scanner.nextLine();
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}







