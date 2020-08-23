public class Person {
    String gender = "Girl";
    String name = "RoboCat";
    double height = 30.5;
    double weight = 5.7;
    int age = 1;

    public String speak(String name) {
        String speak = "I am your friend! I will help you!";
        System.out.println("I am " + name + "! " + "I am " + gender + "! " + "I am " + age + " year old! " + speak);
        return speak;
    }

    public String learnJava(String name) {
        String learn = "I learn Java! I like it! Just do it!";
        System.out.println(learn);
        return learn;
    }

    public double sit(double weight) {
        System.out.println("Weight for chair = " + weight + "kg - sit");
        return weight;
    }

    public double sleep(double height) {
        System.out.println("Height for bed = " + height + "cm - sleep");
        return height;
    }

    public String run(String name) {
        String run = "run";
        System.out.println(run);
        return run;
    }

    public String jump(String name) {
        String jump = "jump";
        System.out.println(jump);
        return jump;
    }
}
