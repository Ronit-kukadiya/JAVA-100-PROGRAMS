// Given an array, rotate the array to the right by k steps, where k is non-negative. 
// Example 1: 
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4] 
// Explanation: 
// rotate 1 step to the right: [7,1,2,3,4,5,6] 
// rotate 2 steps to the right: [6,7,1,2,3,4,5] 
// rotate 3 steps to the right: [5,6,7,1,2,3,4]

import java.util.Scanner;

public class P39_array_rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter lenght of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("enter rotations : ");
        int r = sc.nextInt();
        r = r % n;

        reverse(arr, 0, n - 1);

        reverse(arr, 0, r - 1);

        reverse(arr, r, n - 1);

        System.out.println("rotated array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
