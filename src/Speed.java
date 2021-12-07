/*9. Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per
second, kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).
Example
Input distance in meters: 2500
Input hour: 5
Input minutes: 56
Input seconds: 23
Expected Output:
Your speed in meters/second is 0.11691531
Your speed in km/h is 0.42089513
Your speed in miles/h is 0.26158804 */

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance in meter: ");
        double distance = sc.nextDouble();
        System.out.println("Enter hour: ");
        double hour = sc.nextDouble();
        System.out.println("enter minute: ");
        double minute = sc.nextDouble();
        System.out.println("Enter seconds");
        double seconds = sc.nextDouble();

        double total_seconds = (hour*3600) + (minute*60) + seconds;
        double mps= distance/total_seconds;
        System.out.println("Speed in meter/second is " + mps);

        double kph = (distance/1000)/(total_seconds/3600);
        System.out.println("speed in km/h is " + kph);

        double mph = kph/1.609;
        System.out.println("speed in miles/h is " + mph);

    }
}
