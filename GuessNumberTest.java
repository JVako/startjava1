import java.util.Scanner;

public class GuessNumberTest {
    Scanner scan = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessNumberTest guessNumberTest = new GuessNumberTest();
        GuessNumber guessNumber = new GuessNumber();
        Player player1 = new Player();
        Player player2 = new Player();

        do {
            guessNumberTest.enterName();
            guessNumber.gamePlay();
        } while (guessNumberTest.wantContinue());
    }

    public void enterName() {
       System.out.println("Enter the name of 1 player");
        player1.setName() = scan.nextLine();
        System.out.println(player1.getName());
        System.out.println("Enter the name of 2 player");
        player2.setName() = scan.nextLine();
        System.out.println(player2.getName());
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















