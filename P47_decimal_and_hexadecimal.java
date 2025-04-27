// WAP to Convert a Decimal to Hexa-decimal and vice versa.

import java.util.Scanner;

public class P47_decimal_and_hexadecimal {
    public static void main(String[] args) {
        String n, ans;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("========enter what you want to convert========");
            System.out.println("Enter 1 for decimal to hexadecimal conversion > ");
            System.out.println("Enter 2 for hexadecimal to decimal conversion > ");
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
                n = sc.nextLine();
                ans = ToHexaDecimal(n);
                System.out.println("Octal of " + n + " is " + ans);
            } else if (choice == 2) {
                System.out.print("enter a hexadecimal number : ");
                n = sc.nextInt();
                ans = ToDecimal(n);
                System.out.println("Decimal of " + n + " is " + ans);
            } else {
                System.out.println("enter a valid choice");
            }

            System.out.println();
        }
    }

    public static String ToHexaDecimal(String n) {
        int decimal = n;

        StringBuilder hex = new StringBuilder();
        while (decimal > 0) {
            int temp = decimal % 16;
            if (temp < 10) {
                hex.insert(0, temp);
            } else {
                char hexChar = switch (temp) {
                    case 10 -> 'A';
                    case 11 -> 'B';
                    case 12 -> 'C';
                    case 13 -> 'D';
                    case 14 -> 'E';
                    case 15 -> 'F';
                    default -> '0';
                };
                hex.insert(0, hexChar);
            }
            decimal = decimal / 16;
        }

        return hex.toString();
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
