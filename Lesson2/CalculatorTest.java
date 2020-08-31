import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        char sign = (char) scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
    }
}
