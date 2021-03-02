import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    int index;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, index);
    }

    public void setEnteredNums(int keepNumber) {
        enteredNums[index] = keepNumber;
    }
}
