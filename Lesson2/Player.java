import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name;
    private int number;

    public Player() {
        String name = "";
        this.name = name;
        this.number = number;
    }

    public void setName() {
        this.name = name;
    }

    public void setNumber() {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String nameScan() {
        name = scan.nextLine();
        return name;
    }
}
