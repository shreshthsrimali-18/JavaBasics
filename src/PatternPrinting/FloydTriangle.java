package PatternPrinting;

import java.util.Scanner;

public class FloydTriangle {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int a = 1;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
