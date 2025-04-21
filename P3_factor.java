// WAP to find a Factor of a given number (iterative and recursive) 
// iterative

import java.util.Scanner;

public class P3_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + " are :");
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
