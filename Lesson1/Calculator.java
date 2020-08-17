public class Calculator {
    public static void main(String[] args) {
        //Калькулятор - математические операции (+, -, *, /, ^, %)
        int x = 6;
        int y = 3;
        char sign = '+';//'-','*','/','^','%';
        if (sign == '+') {
            int sum = x + y;
            System.out.print(sum);
        }

        if (sign == '-') {
            int subtraction = x - y;
            System.out.print(subtraction);
        }

        if (sign == '*') {
            int multiplication = x * y;
            System.out.print(multiplication);
        }

        if (sign == '/') {
            int divide = x / y;
            System.out.print(divide);
        }

        if (sign == '^') {
            int degree = 1;
            for (int i = 0; i == y; i++) {
                degree *= x; //degree = degree * x;
            }
             System.out.print(degree);
        }

        if (sign == '%') {
            int remainderOfDivision = x % y;
            System.out.print(remainderOfDivision);
        }
    }
}
