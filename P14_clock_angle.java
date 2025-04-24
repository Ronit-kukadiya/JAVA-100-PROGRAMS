// WAP to calculate an angle between hour and minute hand. (Hours and minutes should be 
// taken from user).

import java.util.Scanner;

public class P14_clock_angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (1-12): ");
        int hour = sc.nextInt();
        System.out.print("Enter minute (1-12): ");
        int min = sc.nextInt();

        float minute_angle = min * 30;

        float hour_angle = (hour % 12) * 30 + (min - 1) * 0.5f;

        float angle = Math.abs(hour_angle - minute_angle);

        if (angle > 180) {
            angle = 360 - angle;
        }

        System.out.println("The angle between hour and minute hands: " + angle + " degrees");
        sc.close();
    }
}