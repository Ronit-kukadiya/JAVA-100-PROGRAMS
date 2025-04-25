// WAP to convert a Binary to Decimal.

import java.util.Scanner;

public class P26_binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("enter a Binary number : ");
        int bin = sc.nextInt();
        int ans = bin;
        double pow = 0;
        double num = 0;
        while (bin > 0) {
            int temp = bin % 10;
            if (temp > 1) {
                System.out.println("enter a valid binary number");
                sc.close();
                return;
            }
            num = num + (temp * Math.pow(2, pow));
            bin = bin / 10;
            pow = pow + 1;
        }

        System.out.println();
        System.out.print("decimal of " + ans + " is : " + num);
        sc.close();
    }
}
