public class Calculator {
    public static void main(String[] args) {
        //Калькулятор - математические операции (+, -, *, /, ^, %)
        int x = 6;
        int y = 3;
        char plus = '+';
        if (plus == '+') {
            int sum = x + y;
            System.out.print(sum + " ");
        }

        char minus = '-';
        if (minus == '-') {
            int subtraction = x - y;
            System.out.print(subtraction + " ");
        }

        char multi = '*';
        if (multi == '*') {
            int multiplication = x * y;
            System.out.print(multiplication + " ");
        }

        char div = '/';
        if (div == '/') {
            int divide = x / y;
            System.out.print(divide + " ");
        }

        char degr = '^';
        if (degr == '^') {
            int degree = 1;
            for (int i = 0; i == y; i++)
                degree = degree * x;
             System.out.print(degree + " ");
        }

        char rem = '%';
        if (rem == '%') {
            int remainderOfDivision = x % y;
            System.out.print(remainderOfDivision + " ");
        }
    }
}
