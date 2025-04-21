// WAP to find a factorial of a given integer (iterative and recursive) 
// iterative

import java.util.Scanner;

public class P4_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int mul = 1;

        for (int i = 1; i <= n; i++) {
            mul = mul * i;
        }
        System.out.println("factorial is " + mul);
        sc.close();
    }
}