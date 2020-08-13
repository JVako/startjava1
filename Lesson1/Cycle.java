public class Cycle {
    public static void main(String[] args) {

        // цикл for - все числа от 0 до 20
        for (int i = 0; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //цикл while - числа от 6 до -6 (с шагом итерации 2)
        int a = 6;
        while (a >= -6) {
            System.out.print(a + " ");
            a -= 2;
        }
        System.out.println();

        //цикл do while - сумма нечетных чисел от 10 до 20
        int c = 10;
        int sum = 0;
        do {
            c++;
            if (c % 2 != 0) {
                System.out.print(c + " ");
                sum  += c;
            }
        } while (c < 20);
        System.out.println();
        System.out.println(sum);
    }
}
