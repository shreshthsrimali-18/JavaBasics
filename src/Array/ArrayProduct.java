package Array;

import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int product = 1;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        System.out.println(product);
    }
}
