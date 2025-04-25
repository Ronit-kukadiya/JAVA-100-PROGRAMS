// WAP to find a power a^b (without using power and multiplication operation).

import java.util.Scanner;

public class P20_power_NO_multiplicaiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the base : ");
        int n = sc.nextInt();
        System.out.print("enter the power : ");
        int m = sc.nextInt();

        if (m == 0) {
            System.out.println("Answer is: 1");
            sc.close();
            return;
        }

        int sum;
        int result = 1;
        for (int i = 0; i < m; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + result;
            }
            result = sum;
        }
        System.out.println("Answer is : " + result);
        sc.close();
    }
}