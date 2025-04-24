// WAP to convert a Decimal number to BCD.

import java.util.Scanner;
import java.util.Stack;

public class P15_decimal_to_BCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int dig;
        Stack<Stack<Integer>> digitStacks = new Stack<>();

        while (n > 0) {
            dig = n % 10;
            Stack<Integer> temp = new Stack<>();
            int count = 0;

            while (dig > 0) {
                temp.push(dig % 2);
                dig = dig / 2;
                count++;
            }

            while (count < 4) {
                temp.push(0);
                count++;
            }

            digitStacks.push(temp);
            n = n / 10;
        }

        System.out.print("BCD: ");
        while (!digitStacks.isEmpty()) {
            Stack<Integer> bcd = digitStacks.pop();
            while (!bcd.isEmpty()) {
                System.out.print(bcd.pop());
            }
            System.out.print(" ");
        }

        sc.close();
    }
}
