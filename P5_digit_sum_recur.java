// WAP to find a summation of a digit of a given number. (Iterative and recursive)
// iterative

import java.util.Scanner;

public class P5_digit_sum_recur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        String n = sc.nextLine();
        char[] strArr = n.toCharArray();

        int sum = digsum(strArr, 0);
        System.out.println("sum of digits of " + n + " are " + sum);
        sc.close();
    }

    public static int digsum(char[] strArr, int i) {
        if (i == strArr.length) {
            return 0;
        }
        return (strArr[i] - '0') + digsum(strArr, i + 1);
    }
}