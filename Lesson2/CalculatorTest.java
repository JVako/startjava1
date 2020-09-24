import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private char sign;

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            calcTest.inputMathExpression();
            calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
            System.out.println(" - it is result");
            System.out.println("Are you want to continue?");
            if (calcTest.yesWantContinue() == true) {
                System.out.println("yes!!! yes!!!");
                calcTest.inputMathExpression();
                calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
                System.out.println(" - it is result");
            } else if (calcTest.wantContinue() == true) {
                continue;
            } else {
                break;
            }
        } while (true);
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
        scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
            if (answer.equals("yes")) {
                runAction = true;
            } else if (answer.equals("no")) {
                runAction = false;
            } else {
                runAction = true;
            }
        } while (runAction);
        return runAction;
    }

    public boolean yesWantContinue() {
        boolean yesRunAction = true;
        scanner = new Scanner(System.in);
        String answerYes;
        do {
            answerYes = scanner.nextLine();
            if (answerYes.equals("yes")) {
                System.out.println("Yes!!! Welcome!!!");
                yesRunAction = true;
            } else {
                yesRunAction = false;
            }
        } while (yesRunAction);
        return yesRunAction;
    }
}

