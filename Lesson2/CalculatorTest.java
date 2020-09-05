import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private char sign;

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        calcTest.inputMathExpression();
        calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
        System.out.println(" - it is result");
        calcTest.wantContinue();
    }

    private void inputMathExpression() {
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

    private void wantContinue() {
        System.out.println("Are you want to continue? ");

        String contin = scanner.nextLine();
        contin = scanner.nextLine();
        if (contin.equals("yes")) {
            inputMathExpression();

        } else if (contin.equals("no")) {
            return;
        } else {
            wantContinue();
        }
    }
}
