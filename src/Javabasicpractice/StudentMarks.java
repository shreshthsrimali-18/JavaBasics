package Javabasicpractice;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's total marks: ");
        int studentmarks = sc.nextInt();
        System.out.println("Enter student's total subjects: ");
        int totalsubjects = sc.nextInt();
        double percentage = (studentmarks * 100 / (totalsubjects * 100));
        System.out.println("Congrats uour percentage is:" + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        }
            else if(percentage >= 80) {
                System.out.println("Grade: A");
            }
            else if(percentage >= 70) {
                System.out.println("Grade: B");
            }
            else if(percentage >= 60) {
                System.out.println("Grade: C");
            }
            else if(percentage >= 50) {
                System.out.println("Grade: D");
            }
            else if(percentage > 50) {
                System.out.println("Grade: Fail ");
            }

        }


}
