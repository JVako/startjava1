public class Calculator {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        char sign = '^'; // '+','-','*','/','^','%' математические операции
        if (sign == '+') {
            System.out.print(x + y);
        } else if (sign == '-') {
            System.out.print(x - y);
        } else if (sign == '*') {
            System.out.print(x * y);
        } else if (sign == '/') {
            System.out.print(x / y);
        } else if (sign == '%') {
            System.out.print(x % y);
        } else if (sign == '^') {
            int degree = 1;
            for (int i = 0; i < y; i++) degree *= x;
            System.out.print(degree);
        }
    }
}