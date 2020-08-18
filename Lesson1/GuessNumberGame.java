import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        number = (int) (Math.random() * 100);
        System.out.println("Player enter a number : ");
        do {
            int player = s.nextInt();
            if (player < number) {
                System.out.println("Player entered number < the number of computer");
            } else if (player > number) {
                System.out.println("Player entered number > the number of computer");
            } else if (player == number) {
                System.out.println("Player guessed the number! = " + number);
                break;
            }
        } while (true);
    }
}


