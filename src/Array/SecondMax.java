package Array;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter array size: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i]!= max ) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}
