package pattern;
import java.util.Scanner;

public class InvertedPyramidstar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row:");
        int input_row = sc.nextInt();
        for (int i = input_row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
