// You are given an integer num. Rearrange the digits of num such that its value is minimized 
// and it does not contain any leading zeros. 
// Return the rearranged number with minimal value. 
// Note that the sign of the number does not change after rearranging the digits. 
// Input: num = 310 
// Output: 103 
// Explanation:  The  possible  arrangements  for  the  digits  of  310  are  013,  031,  103,  130,  301, 
// 310.  
// The arrangement with the smallest value that does not contain any leading zeros is 103.

import java.util.Scanner;

public class P41_number_minimize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int n = sc.nextInt();
        int dig = 0;
        int len = 0;

        int temp = n;
        while (temp > 0) {
            len = len + 1;
            temp = temp / 10;
        }
        int[] arr = new int[len];

        temp = n;
        int i = 0;
        while (temp > 0) {
            dig = temp % 10;
            arr[i] = dig;
            temp = temp / 10;
            i++;
        }

        java.util.Arrays.sort(arr);

        if (arr[0] == 0) {
            int k = 0;
            while (arr[k] == 0) {
                k++;
            }
            temp = arr[k];
            arr[k] = arr[0];
            arr[0] = temp;
        }
        System.out.println("original : " + n);
        int result = 0;
        for (int j = 0; j < len; j++) {
            result = result * 10 + arr[j];
        }
        System.out.println("new smallest : " + result);

        sc.close();
    }
}
