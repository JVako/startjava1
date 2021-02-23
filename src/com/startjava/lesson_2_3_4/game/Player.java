import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int[] enteredNums = new int[3];
    private int playNumber;
    int i;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPlayNumber() {
        return playNumber;
    }

    public void setPlayNumber() {
        playNumber = scan.nextInt();
        this.playNumber = playNumber;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, i);
    }

    public int[] setEnteredNums() {
        playNumber = scan.nextInt();
        enteredNums[i] = playNumber;
        return enteredNums;
    }
}
