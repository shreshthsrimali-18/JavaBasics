package Javabasicpractice;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are ELIGIBLE to vote");
        }
        else {
            System.out.println("You are NOT ELIGIBLE to vote");
        }

    }
}
