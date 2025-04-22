// WAP to find weather given number is Armstrong number is not.

import java.util.Scanner;

public class P11_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int original = n;
        int pow = 0;
        double sum = 0;
        int temp = n;
        while (temp > 0) {
            temp = temp / 10;
            pow = pow + 1;
        }

        temp = n;
        while (temp > 0) {
            int dig = temp % 10;
            sum = sum + Math.pow(dig, pow);
            temp = temp / 10;
        }
        System.out.println("sum of " + original + " is : " + sum);
        if (sum == original) {
            System.out.println(original + " is Armstrong");
        } else {
            System.out.println(original + " is NOT Armstrong");
        }
        sc.close();
    }
}
