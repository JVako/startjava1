import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        do {
            calc.calculate(calcTest.inputMathExpression());
            System.out.println(" - it is result");
        } while (calcTest.isNext());
    }

    public String inputMathExpression() {
        System.out.println("Enter first number, space, enter operation, space, enter second number");
        String expression = scanner.nextLine();
        return expression;
    }

    public boolean isNext() {
        boolean runAction = true;
        String answer = " ";
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
