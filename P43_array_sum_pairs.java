// Given an array of N integers, and an integer K, find the number of pairs of elements in the 
// array whose sum is equal to K. 
// e.g.  
// Input: 
// N = 4, K = 6 
// arr[] = {1, 5, 7, 1} 
// Output: 2 
// Explanation:  
// arr[0] + arr[1] = 1 + 5 = 6 

import java.util.Scanner;

public class P43_array_sum_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array lenght : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the number for sum : ");
        int k = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {
                    count = count + 1;
                }
            }
        }

        System.out.println("Output : " + count);

        sc.close();
    }
}