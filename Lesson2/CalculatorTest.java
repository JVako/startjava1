import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private char sign;

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        do {
            calcTest.inputMathExpression();
            calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
            System.out.println(" - it is result");
            if (calcTest.wantContinue(false)) {
                Scanner scanner = new Scanner(System.in);
                break;
            } else
                calcTest.wantContinue(true);
            Scanner scanner = new Scanner(System.in);
        }
        while (true);
    }

    public void inputMathExpression() {
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

    public static boolean wantContinue(boolean bool) {
        Scanner scanner = new Scanner(System.in);
        String continuing = "";
        do {
            System.out.println("Are you want to continue? ");
            continuing = scanner.nextLine();
            if (continuing.equals("no")) {
                break;
            } else {
                bool = true;
            }
        }
        while (true);
        return bool;
    }
}
