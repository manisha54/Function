//Square star pattern
package pattern;

import java.util.Scanner;

public class SquareStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("enter the number of column: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++)
        {
            for(int j = 1; j <= column; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }


    }
}
