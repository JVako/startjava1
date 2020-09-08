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
        calcTest.wantContinue();
    }

    public void inputMathExpression() {
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
        Calculator.calculate(x, y, sign);
        System.out.println(" - it is result");
    }

    private void wantContinue() {
        for (int i = 1; i > 0; i++) {
            System.out.println("Are you want to continue? ");
            String continuing = scanner.nextLine();
            continuing = scanner.nextLine();
            if (continuing.equals("yes")) {
                inputMathExpression();
            } else if (continuing.equals("no")) {
                return;
            } else {
                wantContinue();
            }
        }
    }
}

