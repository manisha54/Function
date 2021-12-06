
import java.util.Scanner;
public class Palindrome {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String x,y ="";

        System.out.print("Enter a string: ");
        x = sc.nextLine();
        int length = x.length();
        for (int i = length-1 ; i>=0;i--)

            y = y + x.charAt(i);

        if (x.equals(y)){
            System.out.println("it is Parindrome");
        }
        else {
            System.out.println("it is not palindrome");
        }



    }

}
