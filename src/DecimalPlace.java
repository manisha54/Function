/*7. Write a Java program that accepts two floating-point numbers and checks whether they
are the same up to two decimal places.*/

import java.util.Scanner;

public class DecimalPlace {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first floating number: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second floating number: ");
        float num2 = sc.nextFloat();

        if (Math.abs(num1-num2) <=0.01){
            System.out.println("These number are the same");
        }
        else {
            System.out.println("These number are not same");
        }

    }
}
