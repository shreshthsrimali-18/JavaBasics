package Javabasicpractice;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secertNumber = 7;
        int guess;
        int attempts = 0;
        System.out.println("=================================");
        System.out.println("Welcome to Guess The Number Game");
        System.out.println("Guess a number between 1 to 10");
        System.out.println("=================================");
        System.out.println("Enter guess number: ");
        guess = sc.nextInt();
        attempts++;
        while (guess != secertNumber){
            System.out.println("Wrong guess! NICE TRY DIDDY!!! Try again:");
            guess = sc.nextInt();
            if(guess > secertNumber){
                System.out.println("Too High!");
            }
            else if (guess < secertNumber) {
                System.out.println("Too Low!");
            }
            attempts++;
        }
        System.out.println("=================================");
        System.out.println("GAME COMPLETED");
        System.out.println("Congratulations! you guessed the correct number NIGGA.");
        System.out.println("Attemps = " + attempts);
        System.out.println("Thanks for playing.....!!!");
        System.out.println("=================================");
        sc.close();
    }
}
