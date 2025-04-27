// WAP to Convert a Decimal to Octal and Vice versa. 

import java.util.Scanner;

public class P46_decimal_and_octal {
    public static void main(String[] args) {
        int n, ans;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========enter what you want to convert========");
            System.out.println("Enter 1 for decimal to onctal conversion > ");
            System.out.println("Enter 2 for onctal to decimal conversion > ");
            System.out.println("Enter 0 to EXIT ");
            System.out.print("Choice : ");
            int choice = sc.nextInt();

            System.out.println();
            if (choice == 0) {
                System.out.println("    _    _");
                System.out.println("\\_// \\_//");
                System.exit(0);
            } else if (choice == 1) {
                System.out.print("enter a decimal number : ");
                n = sc.nextInt();
                ans = ToOctal(n);
                System.out.println("Octal of " + n + " is " + ans);
            } else if (choice == 2) {
                System.out.print("enter a octal number : ");
                n = sc.nextInt();
                ans = ToDecimal(n);
                System.out.println("Decimal of " + n + " is " + ans);
            } else {
                System.out.println("enter a valid choice");
            }

            System.out.println();
        }
    }

    public static int ToOctal(int n) {
        int temp;
        int num = 0;
        int mul = 1;
        while (n > 0) {
            temp = n % 8;
            num = num + (temp * mul);
            mul = mul * 10;
            n = n / 8;
        }
        return num;
    }

    public static int ToDecimal(int n) {
        int pow = 0;
        int num = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp > 7) {
                System.out.println("enter a valid octal number");
                return 0;
            }
            num = num + (temp * (int) Math.pow(8, pow));
            n = n / 10;
            pow = pow + 1;
        }
        return num;
    }
}
