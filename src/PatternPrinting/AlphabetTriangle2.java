package PatternPrinting;

import java.util.Scanner;

public class AlphabetTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}
