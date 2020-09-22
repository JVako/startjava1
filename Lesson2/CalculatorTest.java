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
        while (calcTest.wantContinue());
    }

    public void inputMathExpression() {
        System.out.println("Enter first number: ");
        x = scanner.nextInt();
        System.out.println("Enter operation: ");
        sign = scanner.next().charAt(0);
        System.out.println("Enter second number: ");
        y = scanner.nextInt();
    }

    public boolean wantContinue() {
        boolean runAction = true;
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                runAction = true;
                inputMathExpression();
            } else if (answer.equals("no")) {
                runAction = false;
            } else {
                runAction = true;
                continue;
            }
        }
        while (runAction != false);
        return runAction;
    }
}
