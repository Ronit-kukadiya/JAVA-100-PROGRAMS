// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value 
// should be taken from user (Note that you are not allowed to use an array for this) 

import java.util.Scanner;

public class P12_min_max_avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min, max;
        double sum = 0;

        System.out.print("how many numbers : ");
        int n = sc.nextInt();

        System.out.print("enter element " + 1 + " : ");
        int temp = sc.nextInt();
        min = max = temp;
        sum = temp;

        for (int i = 1; i < n; i++) {
            System.out.print("enter element " + (i + 1) + " : ");
            temp = sc.nextInt();
            if (temp < min) {
                min = temp;
            } else if (temp > max) {
                max = temp;
            }
            sum = sum + temp;
        }

        System.out.println("MIN : " + min);
        System.out.println("MAX : " + max);
        System.out.println("AVG : " + sum / n);
        sc.close();
    }
}
