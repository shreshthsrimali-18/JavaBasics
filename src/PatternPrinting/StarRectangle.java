package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m; int n;
        System.out.println("Enter number of rows: ");
        m = sc.nextInt();
        System.out.println("Enter number of columns:");
        n = sc.nextInt();
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
