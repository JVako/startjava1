package com.startjava.lesson_2_3.setget;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setAge(12);
        wolf.setGender("woman");
        wolf.setName("GreyBird");
        wolf.setWeight(29.5);
        wolf.setColor("white-grey");

        System.out.println("Wolf age - " + wolf.getAge());
        System.out.println("Wolf gender - " + wolf.getGender());
        System.out.println("Wolf name " + wolf.getName());
        System.out.println("She is a " + wolf.getColor());
        System.out.println("Wolf weight - " + wolf.getWeight());
    }
}