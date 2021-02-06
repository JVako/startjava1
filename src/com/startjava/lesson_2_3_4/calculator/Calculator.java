public class Calculator {
    private static int x;
    private static int y;
    private static char sign;
    private static int res;

    public static void splitExpression(String expression) {
        String[] exprArr = expression.split(" ");
        x = Integer.parseInt(exprArr[0]);
        y = Integer.parseInt(exprArr[2]);
        sign = exprArr[1].charAt(0);
    }

    public static int calculate() {
        switch (sign) {
            case '+':
                System.out.print(x + y);
                return res;
            case '-':
                System.out.print(x - y);
                return res;
            case '*':
                System.out.print(x * y);
                return res;
            case '/':
                System.out.print(x / y);
                return res;
            case '%':
                System.out.print(x % y);
                return res;
            case '^':
                System.out.print((int) Math.pow(x, y));
                return res;
            case 'q':
                System.out.print((int) Math.sqrt(x));
                return res;
            case 'b':
                System.out.print((int) Math.cbrt(x));
                return res;
            case 'f':
                System.out.print((int) Math.floor(x));
                return res;
            case 'c':
                System.out.print((int) Math.ceil(x));
                return res;
        }
        return res;
    }
}

