import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        GuessNumber guessNumber = new GuessNumber();
        Player player1 = new Player("Kate",0);
        Player player2 = new Player("Mary",0);
        do {
            guessNumberTest.enterName();
            guessNumber.gamePlay();
        } while (guessNumberTest.wantContinue());
    }

    public void enterName() {
        String name = " ";
        int number = 0;
        System.out.println("Enter the name of 1 player");
        name = scan.nextLine();
        System.out.println("Enter the name of 2 player");
        name = scan.nextLine();
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






