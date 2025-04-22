// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)
// iterative

import java.util.Scanner;

public class P7_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many numbers of the series : ");
        int n = sc.nextInt();
        System.out.println("fibonacci squuence for " + n + " numbers is :");
        int first = 0;
        int second = 1;
        int sum = 0;

        System.out.print(first + "," + second + ",");
        for (int i = 0; i < (n - 2); i++) {
            sum = first + second;
            System.out.print(sum + ",");
            first = second;
            second = sum;
        }
        sc.close();
    }
}