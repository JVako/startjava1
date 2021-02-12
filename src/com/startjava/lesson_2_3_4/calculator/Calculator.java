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

    public int calculate() {
        switch (sign) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            case '%':
                return x % y;
            case '^':
                return (int) Math.pow(x, y);
            case 'q':
                return (int) Math.sqrt(x);
            case 'b':
                return (int) Math.cbrt(x);
            case 'f':
                return (int) Math.floor(x);
            case 'c':
                return (int) Math.ceil(x);
        }
        return 0;
    }
}
