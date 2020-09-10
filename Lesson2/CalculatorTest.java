import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private char sign;

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        for (int i = 1; i > 0; i++) {
            calcTest.inputMathExpression();
            calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
            System.out.println(" - it is result");
            calcTest.wantContinue();
        }
    }

    public void inputMathExpression() {
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

    public static String wantContinue() {
        Scanner scanner = new Scanner(System.in);
        String continuing = "";
        do {
            System.out.println("Are you want to continue? ");
            continuing = scanner.nextLine();
        } while (continuing != "no");
        return continuing;
    }
}

