// WAP to find a quotient and reminder of 2 number (bigger number should be divided by 
// lower number) and you are not allowed to use a division and quotient operator.

import java.util.Scanner;

public class P29_div_NO_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number : ");
        int n = sc.nextInt();
        System.out.print("enter second number : ");
        int m = sc.nextInt();
        int big, sml;
        int quto = 0;
        int rem = 0;
        if (n > m) {
            big = n;
            sml = m;
        } else {
            big = m;
            sml = n;
        }

        while (big >= sml) {
            big = big - sml;
            quto = quto + 1;
        }
        rem = big;

        System.out.println("quotient : " + quto);
        System.out.println("reminder : " + rem);

        sc.close();
    }
}
