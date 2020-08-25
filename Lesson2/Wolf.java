 public class Wolf {
        String gender = "man";
        String name = "White fang";
        double weight = 32.3;
        int age = 3;
        String color = "gray";

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

