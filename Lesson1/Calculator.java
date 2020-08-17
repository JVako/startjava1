public class Calculator {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        char sign = '^'; // '+','-','*','/','^','%'; математические операции 
        if (sign == '+') { // sum
            System.out.print(x + y);

        } else if (sign == '-') { // subtraction
            System.out.print(x - y);

        } else if (sign == '*') { // multiplication
            System.out.print(x * y);

        } else if (sign == '/') { // divide
            System.out.print(x / y);

        } else if (sign == '^') { // degree
            System.out.print((int) Math.pow(x, y));

        } else if (sign == '%') { // remainderOfDivision
            System.out.print(x % y);
        }
    }
}