// WAP to convert a Decimal to Binary. 

import java.util.Scanner;

public class P30_decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a decimal number : ");
        int n = sc.nextInt();
        int ans = n;
        int temp;
        int num = 0;
        int mul = 1;
        while (n > 0) {
            temp = n % 2;
            num = num + (temp * mul);
            mul = mul * 10;
            n = n / 2;
        }

        System.out.println("binary of " + ans + " is : " + num);

        sc.close();
    }
}
