import java.util.Scanner;
public class GuessGame {
    static int number;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        number = (int) (Math.random() * 100);
        System.out.println("1 player enter a number : ");
        for (int i1 = 0; i1 <= 50; i1++) {
            if (i1 < number) {
                System.out.println("1 player entered number < the number of computer " + i1 + "<" + number);
            }
            else if (i1 > number) {
                System.out.println("1 player entered number > the number of computer " + i1 + ">" + number);
            }
            else if (i1 == number) {
                System.out.println("1 player. You guessed the number! " + i1 + "=" + number);
                break;
            }
        }

        System.out.println("2 player enter a number : ");
        for (int i2 = 51; i2 <= 100; i2++) {
            if (i2 < number) {
                System.out.println("2 player entered number < the number of computer " + i2 + "<" + number);
            }
            else if (i2 > number) {
                System.out.println("2 player entered number > the number of computer  " + i2 + ">" + number);
            }
            else if (i2 == number) {
                System.out.println("2 player. You guessed the number! " + i2 + "=" + number);
                break;
            }
        }
    }
}



