public class Wolf {
    private String gender = "man";
    private String name = "White fang";
    private double weight = 32.3;
    private int age = 10;
    private String color = "gray";
    private int go = 10;
    private String sit = "sit";
    private int run = 25;
    public String howl = "howl";
    public String hunt = "hunting";

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getName() {
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
        }

        this.age = age;
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

    public void setGo(int go) {
        this.go = go;
        System.out.println(name + " walks " + go + " kilometers a day, having weight " + weight + ".");
    }

    public void setSit(String sit) {
        this.sit = sit;
        System.out.println("He(she) likes to " + sit + " on top of a mountain, already " + age + " from birth.");
    }

    public String getSit() {
        return sit;
    }

    public void setRun(int run) {
        this.run = run;
        System.out.println("While hunting, a " + name + " can run " + run + " kilometers a day.");
    }

    public int getRun() {
        return run;
    }

    public void setHowl(String howl) {
        this.howl = howl;
        System.out.println("The full moon is a reason to " + howl + " at the moon.");
    }

    public String getHowl() {
        return howl;
    }

    public void setHunt(String hunt) {
        this.hunt = hunt;
        System.out.println("He(she) is an experienced and very careful, when " + hunt + " having a " + color + "color.");
    }

    public String getHunt() {
        return hunt;
    }
}