public class Calculator {
    private int x;
    private int y;
    private char sign;

    public void splitExpression(String expression) {
        String[] exprArr = expression.split(" ");
        x = Integer.parseInt(exprArr[0]);
        y = Integer.parseInt(exprArr[2]);
        sign = exprArr[1].charAt(0);
    }

    public void calculate(int result) {
        switch (sign) {
            case '+':
                System.out.print(x + y);
                return;
            case '-':
                System.out.print(x - y);
                return;
            case '*':
                System.out.print(x * y);
                return;
            case '/':
                System.out.print(x / y);
                return;
            case '%':
                System.out.print(x % y);
                return;
            case '^':
                System.out.print((int) Math.pow(x, y));
                return;
            case 'q':
                System.out.print((int) Math.sqrt(x));
                return;
            case 'b':
                System.out.print((int) Math.cbrt(x));
                return;
            case 'f':
                System.out.print((int) Math.floor(x));
                return;
            case 'c':
                System.out.print((int) Math.ceil(x));
                return;
        }
    }
}
