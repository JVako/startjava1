import java.util.Scanner;

public class CalculatorTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CalculatorTest calcTest = new CalculatorTest();
        Calculator calc = new Calculator();
        do {
            calc.splitExpression(calcTest.inputMathExpression());
            System.out.println(calc.calculate() +" - it is result");
        } while (calcTest.isNext());
    }

    public String inputMathExpression() {
        System.out.println("Enter a mathematical expression (x + y)");
        return scanner.nextLine();
    }

    public boolean isNext() {
        String answer;
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
