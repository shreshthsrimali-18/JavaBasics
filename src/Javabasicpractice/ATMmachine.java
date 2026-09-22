package Javabasicpractice;

import java.util.Scanner;

public class ATMmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int balance = 1000;
        System.out.println("Enter PIN: ");
        int enteredpin = sc.nextInt();
        if ( enteredpin == pin ) {
            while (true) {
                System.out.println("=====MENU=====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                int choice;
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("------------------------");
                    System.out.println("Current balance =₹ " + (balance));
                    System.out.println("------------------------");
                } else if (choice == 2) {
                    System.out.println("Enter deposit amount: ");
                    int depositamount;
                    depositamount = sc.nextInt();
                    if (depositamount > 0) {
                        balance = balance + depositamount;
                        System.out.println("Deposit Successful!");
                        System.out.println("------------------------");
                        System.out.println("Current balance =₹ " + (balance));
                        System.out.println("------------------------");
                    } else {
                        System.out.println("------------------------");
                        System.out.println("Invaild Amount");
                        System.out.println("------------------------");
                    }

                } else if (choice == 3) {
                    System.out.println("Enter withdraw amount: ");
                    int Withdrawamount;
                    Withdrawamount = sc.nextInt();
                    if (Withdrawamount <= 0) {
                        System.out.println("------------------------");
                        System.out.println("Invaild amount");
                        System.out.println("------------------------");
                    } else if (Withdrawamount > balance) {
                        System.out.println("------------------------");
                        System.out.println("Insufficient balance");
                        System.out.println("------------------------");
                    } else {
                        balance = balance - Withdrawamount;
                        System.out.println("Withdraw Successful");
                        System.out.println("------------------------");
                        System.out.println("Current balance =₹ " + (balance));
                        System.out.println("------------------------");
                    }

                } else if (choice == 4) {
                    System.out.println("------------------------");
                    System.out.println("Thank you for using ATM!!!");
                    System.out.println("------------------------");
                    break;
                } else {
                    System.out.println("------------------------");
                    System.out.println("Invaild choice");
                    System.out.println("------------------------");
                }
            }
        }
        else {
            System.out.println("------------------------");
            System.out.println("Invaild PIN");
            System.out.println("------------------------");
            return;
    }
}}
