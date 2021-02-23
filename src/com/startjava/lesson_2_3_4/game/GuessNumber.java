import java.util.Arrays;

public class GuessNumber {
    private static int randomNum;
    private Player player1;
    private Player player2;
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
        for (i = 0; i < 3; i++) {
            if (player1.getPlayNumber() != randomNum) {
                System.out.println("Player 1 enter number");
                player1.setEnteredNums();
                checkEnteredNum();
                if (player1.getPlayNumber() == randomNum) {
                    System.out.println("\nИгрок " + player1.getName() + " угадал число " + randomNum + " с " + (i + 1) + " попытки");
                    break;
                } else if (i == 3) {
                    System.out.println("\nУ " + player1.getName() + " закончились попытки");
                }
            } else {
                break;
            }
            if (player2.getPlayNumber() != randomNum) {
                System.out.println("Player 2 enter number");
                player2.setEnteredNums();
                checkEnteredNum();
                if (player2.getPlayNumber() == randomNum) {
                    System.out.println("\nИгрок " + player2.getName() + " угадал число " + randomNum + " с " + (i + 1) + " попытки");
                    break;
                } else if (i == 3) {
                    System.out.println("У " + player2.getName() + " закончились попытки");
                }
            } else {
                break;
            }
        }
    }

    public void checkEnteredNum() {
        do {
            if (player1.getPlayNumber() > randomNum || player2.getPlayNumber() > randomNum) {
                System.out.println("Player entered number > the number of computer");
            } else if (player1.getPlayNumber() < randomNum || player2.getPlayNumber() < randomNum) {
                System.out.println("Player entered number < the number of computer");
            } else if (player1.getPlayNumber() == randomNum || player2.getPlayNumber() == randomNum) {
                System.out.println("Yes! Right! Player guessed the number");
                break;
            }
        } while (!true);
    }

    public void fillArrNum() {
        if (i == 3) {
            System.out.println("\nInserted array elements player1:");
            for (i = 0; i < 3; i++) {
                System.out.print(" " + player1.getEnteredNums());
            }
            System.out.println("\nInserted array elements player 2:");
            for (i = 0; i < 3; i++) {
                System.out.print(" " + player2.getEnteredNums());
            }
        } else {
            player1.getEnteredNums();
            player2.getEnteredNums();
        }
    }

    public void messageFinal() {
        if (i == 3) {
            System.out.println("\nУ " + player1.getName() + " закончились попытки");
            System.out.println("У " + player2.getName() + " закончились попытки");
        }
    }

    public void cleanArray() {
        Arrays.fill(player1.getEnteredNums(), i);
        Arrays.fill(player2.getEnteredNums(), i);
    }
}
