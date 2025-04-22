// WAP to find a total odd and total even digit of a given number. 

import java.util.Scanner;

public class P8_odd_even_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        int dig = 0;
        while (n > 0) {
            dig = n % 10;
            n = n / 10;
            if (dig % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("even are : " + even);
        System.out.println("odd are : " + odd);
        sc.close();
    }
}
