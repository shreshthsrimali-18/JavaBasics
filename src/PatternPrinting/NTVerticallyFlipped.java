package PatternPrinting;

import java.security.PublicKey;
import java.util.Scanner;

public class NTVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int k=1; k<=n-i; k++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
