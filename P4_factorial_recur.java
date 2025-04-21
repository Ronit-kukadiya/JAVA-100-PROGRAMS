// WAP to find a factorial of a given integer (iterative and recursive) 
// recursive

import java.util.Scanner;

public class P4_factorial_recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n = sc.nextInt();
        int res = factorial(n);
        System.out.println("factorial of " + n + " is " + res);
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}