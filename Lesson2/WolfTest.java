public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(12);
        wolf.setGender("woman");
        wolf.setName("GreyBird");
        wolf.setWeight(29.5);
        wolf.setColor("white-grey");
        wolf.setGo(8);
        wolf.setSit("sits");
        wolf.setRun(21);
        wolf.setHowl("howl");
        wolf.setHunt("hunting");

        System.out.println("Wolf age - " + wolf.getAge());
        System.out.println("She is a " + wolf.getColor());
        System.out.println("Wolf every day " + wolf.getSit() + " and runs");
        System.out.println("Wolf weight - " + wolf.getWeight());
        System.out.println("Wolf run every day - " + wolf.getRun());
        System.out.println("Wolf moon - " + wolf.getHowl());
        System.out.println("Wolf life - " + wolf.getHunt());
    }
}