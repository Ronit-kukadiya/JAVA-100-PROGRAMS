// Print a following patterns
// *********
//  ******* 
//   *****  
//    ***   
//     *     

import java.util.Scanner;

public class P22_pattern_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of lines : ");
        int n = sc.nextInt();
        int line = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - line; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (line + (line - 1)); j++) {
                System.out.print("*");
            }
            line = line - 1;
            System.out.println();
        }
        sc.close();
    }
}
