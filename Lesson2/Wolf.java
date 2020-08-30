public class Wolf {
    private String gender = "man";
    private String name = "White fang";
    private double weight = 32.3;
    private int age = 10;
    private String color = "gray";

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Wrong age");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int go() {
        int go = 10;
        System.out.println(name + " walks " + go + " kilometers a day, having weight " + weight + ".");
        return go;
    }

    public String sit() {
        String sit = "sit";
        System.out.println("He(she) likes to " + sit + " on top of a mountain, already " + age + " from birth.");
        return sit;
    }

    public int run() {
        int run = 25;
        System.out.println("While hunting, a " + name + " can run " + run + " kilometers a day.");
        return run;
    }

    public String howl() {
        String howl = "howl";
        System.out.println("The full moon is a reason to " + howl + " at the moon.");
        return howl;
    }

    public String hunt() {
        String hunt = "hunting";
        System.out.println("He(she) is an experienced and very careful, when " + hunt + " having a " + color + "color.");
        return hunt;
    }
}