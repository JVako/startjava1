public class Calculator {
    public static void main(String[] args) {

        //Калькулятор - математические операции (+, -, *, /, ^, %)
        int x, y, sum, sub, multi, div, degr_xy, rem;
        x = 6;
        y = 3;

        sum = x + y;
        System.out.println("sum = " + sum);
        if (sum == x + y) {
            System.out.println("Check sum x+y = " + sum);
        }

        sub = (x - y);
        System.out.println("sub = " + sub);

        if (sub == x - y) {
            System.out.println("Check substractoin x-y = " + sub);
        }
        multi = x * y;
        System.out.println("multi = " + multi);
        if (multi == x * y) {
            System.out.println("Check multiplication x*y = " + multi);
        }

        div = x / y;
        System.out.println("div = " + div);
        if (div == x / y) {
            System.out.println("Check division x/y = " + div);
        }

        degr_xy = (x * x * x);
        System.out.println("degr_x^y = " + degr_xy);
        if (degr_xy == x * x * x) {
            System.out.println("Check degree x*x*x = " + degr_xy);
        }

        rem = x % y;
        System.out.println("rem = " + rem);
        if (rem == x % y) {
            System.out.println("Check remains x%y = " + rem);
        }
    }
}