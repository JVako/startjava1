import java.util.Scanner;

public class CalculatorTestArr {
    Scanner scanner = new Scanner(System.in);
    private int x;
    private int y;
    private char sign;

    public static void main(String[] args) {
        CalculatorTestArr calcTest = new CalculatorTestArr();
        CalculatorArr calc = new CalculatorArr();
        Scanner scanner = new Scanner(System.in);
        do {
            calcTest.inputMathExpressionStr();
            calc.calculate(calcTest.x, calcTest.y, calcTest.sign);
            System.out.println(" - it is result");
        } while (calcTest.wantContinue());
    }

    public void inputMathExpressionStr() {
        System.out.println("Enter first number, space, enter operation, space, enter second number");
        String expression = scanner.nextLine();
        String[] exprArr = expression.split(" ");
        int[] numArr = new int[exprArr.length];
        numArr[0] = Integer.parseInt(exprArr[0]);
        numArr[2] = Integer.parseInt(exprArr[2]);
        numArr[1] = exprArr[1].charAt(0);
        char ch = exprArr[1].charAt(0);
        x = numArr[0];
        y = numArr[2];
        sign = ch;
    }

    public boolean wantContinue() {
        boolean runAction = true;
        String answer = " ";
        do {
            System.out.println("Are you want to continue?");
            answer = scanner.nextLine();
        } while (!answer.equals("yes") && !answer.equals("no"));
        return answer.equals("yes");
    }
}
