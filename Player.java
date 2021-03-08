import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempts);
    }

    public int setEnteredNum(int num) {
        enteredNums[attempts] = num;
        return num;
    }

    public void printArray() {
        for (int num : enteredNums)
            System.out.print(" " + enteredNums[attempts]);
    }

    public void cleanArray() {
        Arrays.fill(enteredNums, attempts);
        Arrays.fill(enteredNums, attempts);
    }
}

