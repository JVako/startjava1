public class Person {
        String gender = "Girl";
        String name = "RoboCat";
        double height = 30.5;
        double weight = 5.7;
        int age = 1;

        public double weightSitRoboCat(double weight) {
            System.out.println("Weight for chair = " + weight + "kg - " + name  + " sits.");
            return weight;
        }

        public double heightSitRoboCat(double height) {
            System.out.println("Height for bed = " + height + "cm - " +  name + " sleeps.");
            return height;
        }

        public String runRoboCat(String name) {
            String run = "runs!";
            System.out.println(name + " " + run);
            return run;
        }

        public String jumpRoboCat(String name) {
            String jump = "jumps!";
            System.out.println(name + jump);
            return jump;
        }

        public String speakRoboCat(String name) {
            String speak = "I am your friend! I will help you!";
            System.out.println("I am " + name + "! " + "I am " + gender + "! " + "I am " + age + " year old! " + speak);
            return speak;
        }

        public String learnJavaRoboCat(String name) {
            String learn = "I learn Java! I like it! Just do it!";
            System.out.println("I am " + name + "! " + learn);
            return learn;
        }
    }
