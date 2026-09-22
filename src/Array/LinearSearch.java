package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.print("Enter array size: ");
        m = sc.nextInt();
        int[] arr = new int[m];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int n;
        System.out.print("enter element for searching: ");
        n = sc.nextInt();
        int target = n;
        boolean found = false;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == target){
                System.out.println("Target exists in array at index " + i);
                found = true;
                break;
            }
        }
        if (found == false){
            System.out.println("Target missing in array");
        }
    }
}
