/*6. Write a Java program that accepts three numbers from the user and prints "increasing" if
the numbers are in increasing order, "decreasing" if the numbers are in decreasing
order, and "Neither increasing or decreasing order" otherwise.*/

import java.util.Scanner;

public class IncresingDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = sc.nextInt();
        System.out.println("Enter second number: ");
        int second = sc.nextInt();
        System.out.println("Enter third number: ");
        int third = sc.nextInt();

        if (first>second && second>third){
            System.out.println("Decresing order");
        }
        else if (first<second && second<third){
            System.out.println("Increasing order");
        }
        else {
            System.out.println("neither inceasing or decreasing");
        }

    }
}
