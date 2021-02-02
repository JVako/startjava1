public class CalculatorArr {
    public static void calculate(int x, int y, char sign) {
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
    }
}
