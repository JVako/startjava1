public class Calculator {
    public static int x;
    public static int y;
    public static char sign;
    public static int res;

    public static void splitExpression(String expression) {
        String[] exprArr = expression.split(" ");
        x = Integer.parseInt(exprArr[0]);
        y = Integer.parseInt(exprArr[2]);
        sign = exprArr[1].charAt(0);
    }

    public static void calculate() {
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