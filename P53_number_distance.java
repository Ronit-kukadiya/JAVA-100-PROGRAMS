// Write a program to take 2 numbers from user and find out the distance between them.  
// (How to compute distance: If number is 10 and 18   then 10 in binary 1010 and 18 in binary 
// is 10010 and distance is 2 means total number of bits that needs to be changed when 10 is 
// converted into 18 or 18 is converted into 10, do not convert the number into binary) 

import java.util.Scanner;

public class P53_number_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st decimal number : ");
        int n = sc.nextInt();
        System.out.println("enter 2nd decimal number : ");
        int m = sc.nextInt();

        int dist = 0;

        dist = n ^ m;
        int count = 0;
        while (dist != 0) {
            count += dist & 1;
            dist = dist >> 1;
        }
        System.out.println("distance between " + n + " and " + m + " is " + count);

        sc.close();
    }
}
