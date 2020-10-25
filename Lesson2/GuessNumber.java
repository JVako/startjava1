import java.util.Scanner;

public class GuessNumber {
    private static int computerNumber;

    public GuessNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public void setComputerNumber() {
        this.computerNumber = computerNumber;
    }

    public static int getComputerNumber() {
        return computerNumber;
    }

    public static int generateNumber() {
        Scanner scan = new Scanner(System.in);
        int computerNumber = (int) (Math.random() * 101);
        return computerNumber;
    }
}
