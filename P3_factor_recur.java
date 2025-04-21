// WAP to find a Factor of a given number (iterative and recursive) 
// recursive

import java.util.Scanner;

public class P3_factor_recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();

        System.out.println("factors of " + n + " are : ");
        factor(n, 1);
        sc.close();
    }

    public static void factor(int n, int i) {
        if (i > n) {
            return;
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        factor(n, i + 1);
    }

}
