package com.startjava.lesson_1.game;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 101);
        System.out.println("Player enter a number : ");
        do {
            int playerGuess = scan.nextInt();
            if (playerGuess < guessNumber) {
                System.out.println("Player entered number < the number of computer");
            } else if (playerGuess > guessNumber) {
                System.out.println("Player entered number > the number of computer");
            } else if (playerGuess == guessNumber) {
                System.out.println("Player guessed the number! = " + guessNumber);
                break;
            }
        } while (true);
    }
}