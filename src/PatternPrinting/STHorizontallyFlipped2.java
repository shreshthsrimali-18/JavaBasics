package PatternPrinting;

import java.util.Scanner;

public class STHorizontallyFlipped2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
}
