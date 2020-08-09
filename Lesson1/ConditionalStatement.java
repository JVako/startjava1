public class ConditionalStatement {
    public static void main(String[] args) {
        int myAge = 35;
        String passport = "genderWoman";
        double height = 1.6;
        char beginLetterName = 'U';

        if (myAge > 25) {
            System.out.println("Personality");
        }
        if (passport == "genderMan") {
            System.out.println("Man");
        }
        if (passport != "genderMan") {
            System.out.println("Woman");
        }
        if (height < 1.8) {
            System.out.println("Height < 1,8 m");
        } else {
            System.out.println("Height > 1,8 m");
        }
        if (beginLetterName == 'U') {
            System.out.println("Name IULIIA");
        }
        if (beginLetterName == 'A') {
            System.out.println("Name Alice");
           } else {
             System.out.println("Name null");
            }
        }
    }