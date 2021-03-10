import java.util.Arrays;

public class Player {
    private String name;
    private int[] enteredNums = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getEnteredNums() {
    return Arrays.copyOf(enteredNums, attempt);
    }

    public void setEnteredNum(int num) {
        for (attempt = 0; attempt < enteredNums.length; attempt++) {
            Arrays.fill(enteredNums, num);
        }
    }

    public void clearAttempts() {
        Arrays.fill(enteredNums, attempt);
    }
}

