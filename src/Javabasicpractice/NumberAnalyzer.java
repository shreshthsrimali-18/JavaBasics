package Javabasicpractice;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        if (n == 0) {
            System.out.println("zero");
        }
        else if (n > 0) {
                System.out.println("positive");
            }
        else {
                System.out.println("negative");
            }

        System.out.println("Square = " + (n*n));
        System.out.println("Cube = " + (n*n*n));

        sc.close();

        }
    }

