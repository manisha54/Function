/*Write a Java program that reads a line of integers and then displays each
integer and the sum of all integers.*/


import java.util.Scanner;
import java.util.StringTokenizer;

public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter integers with one space gap: ");
        String x = sc.nextLine();
        StringTokenizer st= new StringTokenizer(x," ");
        while (st.hasMoreTokens()){
            String temp = st.nextToken();
            int s = Integer.parseInt(temp);
            System.out.println(s);;
            sum = sum+s;
        }
        System.out.println("sum of integers is : " + sum);


    }
}
