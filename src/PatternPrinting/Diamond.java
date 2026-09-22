package PatternPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i<=n-1; i++){
            for (int k=1; k<=i; k++) {
                System.out.print("  ");
            }
            for (int j=1; j<=2*(n-i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
