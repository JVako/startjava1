import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private static int randomNum;
    private Player player1;
    private Player player2;
    public int playNumber;
    private int index;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void randNum() {
        randomNum = (int) (Math.random() * 101);
        System.out.println("GENERATE NUMBER " + randomNum);
    }

    public void start() {
        do {
            randNum();
            System.out.println("You have 10 attempts");
            for (index = 0; index < 10; index++) {
                System.out.println("Player 1 enter number");
                playNumber = scan.nextInt();
                player1.setEnteredNums(playNumber);
                checkEnteredNum();
                if (playNumber == randomNum) {
                    System.out.println("\nИгрок " + player1.getName() + " угадал число " + randomNum + " с " + (index + 1) + " попытки");
                    break;
                }
                System.out.println("Player 2 enter number");
                playNumber = scan.nextInt();
                player2.setEnteredNums(playNumber);
                checkEnteredNum();
                if (playNumber == randomNum) {
                    System.out.println("\nИгрок " + player2.getName() + " угадал число " + randomNum + " с " + (index + 1) + " попытки");
                    break;
                }
            }
        } while (!true);
        messageFinal();
        fillArrNum();
        cleanArray();
    }

    public void checkEnteredNum() {
        if (playNumber > randomNum) {
            System.out.println("Player entered number > the number of computer");
        } else if (playNumber < randomNum) {
            System.out.println("Player entered number < the number of computer");
        } else if (playNumber == randomNum) {
            System.out.println("Yes! Right! Player guessed the number");
        }
    }

    public void messageFinal() {
        if (index == 10) {
            System.out.println("\nУ " + player1.getName() + " закончились попытки");
            System.out.println("У " + player2.getName() + " закончились попытки");
        }
    }

    public void fillArrNum() {
        if (index == 10) {
            System.out.println("\nInserted array elements player1:");
            for (index = 0; index < 10; index++) {
                System.out.print(" " + player1.getEnteredNums());
                // int[] arrNums = player1.getEnteredNums();
                //System.out.println(Arrays.toString(arrNums));
                //***
                //String s = Arrays.toString(player1.getEnteredNums());
                //System.out.println(s);
            }
            System.out.println("\nInserted array elements player 2:");
            for (index = 0; index < 10; index++) {
                System.out.print(" " + player2.getEnteredNums());
            }
        } else {
            player1.getEnteredNums();
            player2.getEnteredNums();
        }
    }

    public void cleanArray() {
        Arrays.fill(player1.getEnteredNums(), index);
        Arrays.fill(player2.getEnteredNums(), index);
    }
}

