package Javabasicpractice;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Firstnumber;
        double Secondnumber;
        System.out.println("===== SIMPLE CALCULATOR =====");
        System.out.println("Enter first number: ");
         Firstnumber = sc.nextDouble();
        System.out.println("Enter second number: ");
         Secondnumber = sc.nextDouble();
        System.out.println("Choose Operation");
        System.out.println("1. Addition (+)");
        System.out.println("2. subtraction (-)");
        System.out.println("3. multiplication (*)");
        System.out.println("4. division (/)");
        System.out.println("5. remainder (%)");

        int choice ;
        System.out.println("Enter choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Addition = " + (Firstnumber + Secondnumber));
            break;
            case 2:
            System.out.println("Subtraction = " + (Firstnumber - Secondnumber));
            break;
            case 3:
            System.out.println("Multiplication = " + (Firstnumber * Secondnumber));
            break;
            case 4:
                if (Secondnumber != 0){
                    System.out.println("Division = " + (Firstnumber / Secondnumber));
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
            break;
            case 5:
            System.out.println("Remainder = " + (Firstnumber % Secondnumber));
            break;
            default:
                System.out.println("Invaid choice");
        }
        sc.close();

    }
}
