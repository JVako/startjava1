import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private static int randomNum;
    private Player player1;
    private Player player2;
    private int playNumber1, playNumber2;
    private int[] arrNumP1 = new int[10];
    private int[] arrNumP2 = new int[10];
    private int i;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void randNum() {
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
        System.out.println("You have 10 attempts");
    }

    public void start() {
        for (i = 0; i < 10; i++) {
            System.out.println("Player 1 enter number");
            playNumber1 = scan.nextInt();
            arrNumP1[i] = playNumber1;
            if (playNumber1 == randomNum) {
                System.out.println("Yes! Right! " + player1.getName() + " guessed the number");
                break;
            } else if (playNumber1 > randomNum) {
                System.out.println("Player 1 entered number > the number of computer");
            } else if (playNumber1 < randomNum) {
                System.out.println("Player 1 entered number < the number of computer");
            }

            System.out.println("Player 2 enter number");
            playNumber2 = scan.nextInt();
            arrNumP2[i] = playNumber2;
            if (playNumber2 == randomNum) {
                System.out.println("Yes! Right! " + player2.getName() + " guessed the number");
                break;
            } else if (playNumber2 > randomNum) {
                System.out.println("Player 2 entered number > the number of computer");
            } else if (playNumber2 < randomNum) {
                System.out.println("Player 2 entered number < the number of computer");
            }
        }
    }

    public void fillArrNum() {
        if (i == 10) {
            System.out.println("\nInserted array elements player1:");
            for (i = 0; i < 10; i++) {
                System.out.print(" " + arrNumP1[i]);
            }
            System.out.println("\nInserted array elements player 2:");
            for (i = 0; i < 10; i++) {
                System.out.print(" " + arrNumP2[i]);
            }
        } else {
            Arrays.copyOf(arrNumP1, i);
            Arrays.copyOf(arrNumP2, i);
        }
    }

    public void messageFinal() {
        if (i < 10) {
            System.out.println("\nИгрок " + player1.getName() + " угадал число " + randomNum + " с " + (i + 1) + " попытки");
        } else if (i < 10) {
            System.out.println("\nИгрок " + player2.getName() + " угадал число " + randomNum + " с " + (i + 1) + " попытки");
        } else if (i == 10) {
            System.out.println("\nУ " + player1.getName() + " закончились попытки");
            System.out.println("У " + player2.getName() + " закончились попытки");
        }
    }

    public void cleanArray() {
        Arrays.fill(arrNumP1, i);
        Arrays.fill(arrNumP2, i);
    }
}
