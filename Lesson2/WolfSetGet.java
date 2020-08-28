public class WolfSetGet {
    private String gender = "man";
    private String name = "White fang";
    private double weight = 32.3;
    private int age = 9;
    private String color = "gray";

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String getGender() {
        System.out.println(gender);
        return gender;
    }

    public double getWeight() {
        System.out.println(weight);
        return weight;
    }

    public int getAge() {
        System.out.println(age);
        return age;
    }

    public String getColor() {
        System.out.println(color);
        return color;
    }

    public int setAge() {
        int age = 9;
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
        return age;
    }

    public int setGo() {
        int go = 10;
        System.out.println(name + " walks " + go + " kilometers a day, having weight " + weight + ".");
        return go;
    }

    public String setSit() {
        String sit = "sit";
        System.out.println("He(she) likes to " + sit + " on top of a mountain, already " + age + " from birth.");
        return sit;
    }

    public int setRun() {
        int run = 25;
        System.out.println("While hunting, a " + name + " can run " + run + " kilometers a day.");
        return run;
    }

    public String setHowl() {
        String howl = "howl";
        System.out.println("The full moon is a reason to " + howl + " at the moon.");
        return howl;
    }

    public String setHunt() {
        String hunt = "hunting";
        System.out.println("He(she) is an experienced and very careful, when " + hunt + " having a " + color + "color.");
        return hunt;
    }

    public String setGender() {
        String gender = "man";
        System.out.println(gender);
        return gender;
    }
    public String setName() {
        String name = "White cat";
        System.out.println(name);
        return name;
    }
    public double setWeight () {
        double weight = 31.1;
        System.out.println(weight);
        return weight;
    }
    public String setColor() {
        String color = "White";
        System.out.println(color);
        return color;
    }

}
