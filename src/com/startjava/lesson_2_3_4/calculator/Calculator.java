public class Calculator {
    private int x;
    private int y;
    private char sign;
    private int result;

    public void splitExpression(String expression) {
        String[] exprArr = expression.split(" ");
        x = Integer.parseInt(exprArr[0]);
        y = Integer.parseInt(exprArr[2]);
        sign = exprArr[1].charAt(0);
    }

    public int calculate() {
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
            case 'q':
                System.out.print((int) Math.sqrt(x));
                break;
            case 'b':
                System.out.print((int) Math.cbrt(x));
                break;
            case 'f':
                System.out.print((int) Math.floor(x));
                break;
            case 'c':
                System.out.print((int) Math.ceil(x));
                break;
        }
        return result;
    }
}
