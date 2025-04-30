// WAP to Convert a Decimal to Hexa-decimal and vice versa.

import java.util.Scanner;

public class P47_decimal_and_hexadecimal {
    public static void main(String[] args) {
        String ans;
        Scanner sc = new Scanner(System.in);

        System.out.println("====== enter your choice ======");
        System.out.println("Enter 1 for decimal to HEXA : ");
        System.out.println("Enter 2 for HEXA to decimal : ");
        System.out.println("Enter 0 to EXIT : ");
        System.out.print("CHOICE : ");
        int choice = sc.nextInt();

        if (choice == 0) {
            System.out.println("Exiting....");
            System.exit(0);
        } else if (choice == 1) {
            System.out.print("enter a decimal number : ");
            String dec = sc.next();
            ans = toHexa(dec);

        } else if (choice == 2) {
            System.out.print("enter a Hexa number : ");
            // String hex = sc.next();
        } else {
            System.out.println("enter a valid input");
        }

        sc.close();
    }

    public static String toHexa(String dec) {

        StringBuilder hex = new StringBuilder();

        int n = Integer.parseInt(dec);
        int temp;
        int num = 0;
        int mul = 1;
        while (n > 0) {
            temp = n % 16;
            if (temp < 10) {
                hex.append(temp);
            } else if (temp > 9) {
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
            num = num + (temp * mul);
            mul = mul * 10;
            n = n / 16;

        }
        return (String)num;
    }
}
