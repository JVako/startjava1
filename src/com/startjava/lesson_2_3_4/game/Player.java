public class Player {

    private String name;
    private int number;
    private int[] arrNum;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[] getArrNum() {
        return arrNum;
    }

    public void setArrNum(int[] arrNum) {
        this.arrNum = arrNum;
    }
}
