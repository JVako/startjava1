public class Calculator {
    public void MathOperations(int x, int y, char sign) {
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
                int degree = 1;
                for (int i = 0; i < y; i++) degree *= x;
                System.out.print(degree);
                break;
        }
    }
}