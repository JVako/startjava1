import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private static int randomNum;
    private Player player1;
    private Player player2;
    private int num;
    private int numOfAttempts;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void randNum() {
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
    }

    public void start() {
        randNum();
        System.out.println("You have 10 attempts");
        for (numOfAttempts = 0; numOfAttempts < 10; numOfAttempts++) {
            enterNumberPlayer1();
            if (checkEnteredNum()) {
                System.out.println("\nИгрок " + player1.getName() + " угадал число " + randomNum + " с " + (numOfAttempts + 1) + " попытки");
                break;
            }
            enterNumberPlayer2();
            if (checkEnteredNum()) {
                System.out.println("\nИгрок " + player2.getName() + " угадал число " + randomNum + " с " + (numOfAttempts + 1) + " попытки");
                break;
            }
        }
        messageFinal();
        displayNumbers();
        player1.clearAttempts();
        player2.clearAttempts();
    }

    private void enterNumberPlayer1() {
        System.out.println("Player 1 enter number");
        player1.setEnteredNum(scan.nextInt());
    }

    private void enterNumberPlayer2() {
        System.out.println("Player 2 enter number");
        player2.setEnteredNum(scan.nextInt());
    }

    private boolean checkEnteredNum() {
        boolean check = (num == randomNum);
        if (num == randomNum) {
            System.out.println("Yes! Right! Player guessed the number");
        } else {
            String resultCheckNum = (num > randomNum) ? "Player entered number > the number of computer" : "Player entered number < the number of computer";
            System.out.println(resultCheckNum);
        }
        return check;
    }

    private void messageFinal() {
        if (numOfAttempts == 10) {
            System.out.println("\nУ " + player1.getName() + " закончились попытки");
            System.out.println("У " + player2.getName() + " закончились попытки");
        }
    }

    private void displayNumbers() {
        if (numOfAttempts == 10) {
            System.out.println("\nInserted array elements player1:");
            printAttemptsPlayer1();
            System.out.println("\nInserted array elements player 2:");
            printAttemptsPlayer2();
        }
    }

    public void printAttemptsPlayer1() {
        Arrays.fill(player1.getEnteredNums(), numOfAttempts);
        System.out.println(Arrays.toString(player1.getEnteredNums()));
    }

    public void printAttemptsPlayer2() {
        Arrays.fill(player2.getEnteredNums(), numOfAttempts);
        System.out.println(Arrays.toString(player2.getEnteredNums()));
    }
}


