// Print a following patterns
//    1
//   A B
//  2 3 4
// C D E F

import java.util.Scanner;

public class P22_pattern_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines : ");
        int n = sc.nextInt();
        int line = 0;
        int number = 1;
        int index = 0;
        char[] alpha = new char[26];
        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char) ('A' + i);
        }

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n - line; j++) {
                System.out.print(" ");
            }
            if (line % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
            } else if (line % 2 == 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(alpha[index] + " ");
                    index++;
                }
            }
            System.out.println();
            line++;
        }
        sc.close();
    }
}
