public class Calculator {
    public void calculateMathOper(int x, int y, char sign) {
        switch (sign) {
            case '+':
                System.out.print(x + y);
                break;
            case '-':
                System.out.print(x - y);
                break;
            case '*':
                System.out.print(x * y);
                break;
            case '/':
                System.out.print(x / y);
                break;
            case '%':
                System.out.print(x % y);
                break;
            case '^':
                System.out.print((int) Math.pow(x, y));
                break;
        }
    }
}