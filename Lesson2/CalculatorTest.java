import java.util.Scanner;

public class CalculatorTest extends Calculator {
    Scanner scanner;
    int x;
    int y;
    char sign;

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        calcTest.inputOper();
        calc.calculateMathOper(calcTest.x, calcTest.y, calcTest.sign);
        System.out.println(" - it is result");
        calcTest.wantContinue();
    }

    private void inputOper() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

    private void wantContinue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you want to continue? ");
        String contin = scanner.nextLine();
        if (contin.equals("yes")) {
            inputOper();
        } else if (contin.equals("no")) {
            return;
        } else {
            wantContinue();
        }
    }
}
