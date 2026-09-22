package Javabasicpractice;

import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName;
        int subject1;
        int subject2;
        int subject3;
        int subject4;
        int subject5;
        System.out.println("Enter student name: ");
        studentName = sc.nextLine();
        System.out.println("Enter marks of subject 1 : ");
        subject1 = sc.nextInt();
        System.out.println("Enter marks of subject 2 : ");
        subject2 = sc.nextInt();
        System.out.println("Enter marks of subject 3 : ");
        subject3 = sc.nextInt();
        System.out.println("Enter marks of subject 4 : ");
        subject4 = sc.nextInt();
        System.out.println("Enter marks of subject 5 : ");
        subject5 = sc.nextInt();
        int total;
        double percentage;
        total = subject1 + subject2 + subject3 + subject4 + subject5;
        percentage = (total / 500.0) * 100;
        System.out.println("Student Name : " + studentName);
        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade : A+");
        }
        else if (percentage >= 80) {
            System.out.println("Grade : A");
        }
        else if (percentage >= 70) {
            System.out.println("Grade : B");
        }
        else if (percentage >= 60) {
            System.out.println("Grade : C");
        }
        else if (percentage >= 50) {
            System.out.println("Grade : D");
        }
        else {
            System.out.println("Grade : F");
        }
        if (percentage >= 33) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }
        sc.close();
    }
}
