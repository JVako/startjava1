public class ConditionalStatement {
    public static void main(String[] args) {
        int Age = 35;
        if (Age > 25) {
            System.out.println("Personality");
        }

        String passport = "genderWoman";
        if (passport == "genderMan") {
            System.out.println("Man");
        }
        else if (passport != "genderMan") {
            System.out.println("Woman");
        }

        double height = 1.6;
        if (height < 1.8) {
            System.out.println("Height < 1,8 m");
        } else {
            System.out.println("Height > 1,8 m");
        }

        char firstNameLetter = 'U';
        if (firstNameLetter == 'U') {
            System.out.println("Name IULIIA");
        }
         else if (firstNameLetter == 'A') {
            System.out.println("Name Alice");
        } else {
            System.out.println("Name null");
        }
    }
}
