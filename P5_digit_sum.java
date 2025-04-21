// WAP to find a summation of a digit of a given number. (Iterative and recursive)
// iterative

import java.util.Scanner;

public class P5_digit_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        String n = sc.nextLine();
        int sum = 0;
        char[] strArr = n.toCharArray();

        for (int i = 0; i < strArr.length; i++) {
            sum = sum + (strArr[i] - '0');
        }
        System.out.println("sum of digits of " + n + " are " + sum);
    }
}
