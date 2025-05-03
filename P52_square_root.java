// Given a non-negative integer x, compute and return the square root of x. 
// Since the return type is an integer, the decimal digits are truncated, and only the integer part 
// of the result is returned. 
// Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 
// 0.5) or x ** 0.5. 

import java.util.Scanner;

public class P52_square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a non-number : ");
        int n = sc.nextInt();
        double low = 0;
        double high = n;
        double mid = 0;

        if (n < 0) {
            System.out.println("Invalid input. Enter a non-negative number.");
            System.exit(0);
        }

        if (n == 0 || n == 1) {
            System.out.println("square root of " + n + " is " + n);
        }
        while ((high - low) > 0.0001) {
            mid = (low + high) / 2;

            if (mid * mid > n) {
                high = mid;
            } else {
                low = mid;
            }
        }
        System.out.println("Square root of " + n + " is " + (int) high);

        sc.close();
    }
}
