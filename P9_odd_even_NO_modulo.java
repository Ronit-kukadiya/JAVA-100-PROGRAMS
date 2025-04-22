// WAP to find whether a number is Odd or Even without using a % operator.

import java.util.Scanner;

public class P9_odd_even_NO_modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        if ((n & 1) == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        sc.close();
    }
}
