// Print a following patterns
// *********
// **** ****
// ***   ***
// **     **
// *       *


import java.util.Scanner;
public class P22_pattern_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines : ");
        int n = sc.nextInt();
        int line = 0;
        for (int i = n; i >= 0; i--) {      
            for (int j = (n - line); j >= 0; j--) {
                System.out.print("*");
            }
            for (int j = (line + (line - 1)); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = (n - line); j >= 0; j--) {
                System.out.print("*");
            }
            line = line + 1;
            System.out.println();
        }
        sc.close();
    }
}
