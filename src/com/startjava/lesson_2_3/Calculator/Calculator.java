public class Calculator {
    public static void calculate(String expression) {
        int x, y;
        char sign;
        String[] exprArr = expression.split(" ");
        int[] numArr = new int[exprArr.length];
        numArr[0] = Integer.parseInt(exprArr[0]);
        numArr[2] = Integer.parseInt(exprArr[2]);
        numArr[1] = exprArr[1].charAt(0);
        sign = exprArr[1].charAt(0);
        x = numArr[0];
        y = numArr[2];
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
