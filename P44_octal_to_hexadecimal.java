// WAP to convert an Octal into hexa-decimal.

import java.util.Scanner;

public class P44_octal_to_hexadecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a octal number : ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a valid positive octal number");
            System.exit(0);
        }

        if (n == 0) {
            System.out.println("Hexadecimal of " + n + " is 0");
            System.exit(0);
        }

        String ans = Converter(n);

        System.out.println("hexadecimal  of " + n + " is " + ans);
        sc.close();
    }

    public static int ToDecimal(int n) {
        int octal = n;
        int pow = 0;
        int num = 0;
        while (octal > 0) {
            int temp = octal % 10;
            if (temp > 7) {
                System.out.println("enter a valid Octal number");
                System.exit(0);
            }
            num = num + (temp * (int) Math.pow(8.0, (double) pow));
            octal = octal / 10;
            pow = pow + 1;
        }
        return num;
    }

    public static String Converter(int n) {
        int decimal = ToDecimal(n);

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

}
