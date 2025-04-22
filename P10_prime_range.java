// WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;

public class P10_prime_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lower limit : ");
        int n = sc.nextInt();
        System.out.print("enter the upper limit : ");
        int m = sc.nextInt();
        int count = 0;

        System.out.println("prime numbers between " + n + " and " + m + " are : ");
        while (n <= m) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.print(n + " ");
            }
            count = 0;
            n = n + 1;
        }
        sc.close();
    }
}
