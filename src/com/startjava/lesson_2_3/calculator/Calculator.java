package com.startjava.lesson_2_3.calculator;

public class Calculator {
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
        }
    }
}
