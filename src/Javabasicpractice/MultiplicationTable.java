package Javabasicpractice;

import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; int l;
        System.out.println("Enter your number: ");
        n = sc.nextInt();
        System.out.println("Enter limit: ");
        l = sc.nextInt();
        if(n<=0){
            System.out.println("Invaild Number!");
        } else {
            for (int i = 1; i <= l; i++) {
                System.out.println(n + "x" + i + "=" + (n * i));
            }
        }
    }
}
