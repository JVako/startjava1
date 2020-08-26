public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.age = 2;
        wolf.gender = "woman";
        wolf.name = "GreyBird";
        wolf.weight = 29.5;
        wolf.color = "white-grey";

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}