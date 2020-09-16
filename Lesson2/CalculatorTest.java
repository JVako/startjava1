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
        }
        while (calcTest.wantContinue(true));
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
        String continuing = "Are you want to continue?";
        String answer;
        do {
            System.out.println(continuing);
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                bool = true;
                return true;
            } else if (answer.equals("no")) {
                bool = false;
                return false;
            } else {
                bool = true;
                continue;
            }
        }
        while (bool != false);
        return bool;
    }
}

