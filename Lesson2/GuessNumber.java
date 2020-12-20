import java.util.Scanner;

public class GuessNumber {
    Scanner scan = new Scanner(System.in);
    private int playerNumber;
    private int computerNumber;

    public GuessNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void generateNumber() {
        setComputerNumber((int) (Math.random() * 101));
        System.out.println("GENERATE NUMBER " + getComputerNumber());
    }

    public void enterNumberPlayer1() {
        do {
            System.out.println(" - 1 player enter number.");
            setPlayerNumber(scan.nextInt());
            if (getPlayerNumber() < getComputerNumber()) {
                System.out.println("Player 1 entered number < the number of computer.");
            } else if (getPlayerNumber() > getComputerNumber()) {
                System.out.println("Player 1 entered number > the number of computer");
            } else if (getPlayerNumber() == getComputerNumber()) {
                System.out.println("Yes! Right! Player1 You guessed the number! This is number " + getPlayerNumber() + " !");
                scan.nextInt();
                break;
            }
        } while (!true);
    }

    public void enterNumberPlayer2() {
        do {
            System.out.println(" - 2 player enter number.");
            setPlayerNumber(scan.nextInt());
            if (getPlayerNumber() < getComputerNumber()) {
                System.out.println("Player 2 entered number < the number of computer.");
            } else if (getPlayerNumber() > getComputerNumber()) {
                System.out.println("Player 2 entered number > the number of computer");
            } else if (getPlayerNumber() == getComputerNumber()) {
                System.out.println("Yes! Right! Player2 You guessed the number! This is number " + getPlayerNumber() + " !");
                scan.nextInt();
                break;
            }
        } while (!true);
    }
}

