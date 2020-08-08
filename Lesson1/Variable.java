public class Variable {
    public static void main(String[] args) {
        int logic = 8; // логич.процессы
        short core = 4; // ядра
        long desk = 112338L; //дескрипторы
        byte cash = 125; //Кэш КБ
        double speed = 2.39; //скорость
        float basicSpeed = 2.0F; //базовая скорость
        char animal_m = 'm';
        char animal_o = 'o';
        char animal_u = 'u';
        char animal_s = 's';
        char animal_e = 'e';
        boolean virtual;
        int time = 10;
        if (time > 8) {
            virtual = true;
        } else {
            virtual = false;
        }
        System.out.println("logic process: " + logic);
        System.out.println("Core: " + core);
        System.out.println("Descriptors: " + desk);
        System.out.println("Cash KB: " + cash );
        System.out.println("Speed: " + speed );
        System.out.println("Basic speed: " + basicSpeed);
        System.out.println("I have one gray " + animal_m + animal_o + animal_u + animal_s + animal_e);
        System.out.println("If time > 8 o'clock in the morning virtual enable: " + virtual);
    }
}