// Given two integer arrays nums1 and nums2, return an array of their intersection. Each 
// element in the result must appear as many times as it shows in both arrays and you may 
// return the result in sorted order

import java.util.Scanner;

public class P35_array_intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length of array 1 : ");
        int n = sc.nextInt();
        System.out.print("enter length of array 2 : ");
        int m = sc.nextInt();

        int[] nums1 = new int[n];
        int[] nums2 = new int[m];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " of array 1 : ");
            nums1[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print("enter element " + i + " of array 2 : ");
            nums2[i] = sc.nextInt();
        }

        java.util.Arrays.sort(nums1);
        java.util.Arrays.sort(nums2);

        int res = 0;
        int[] result = new int[Math.max(n, m)];

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (nums1[i] == nums2[j]) {
                result[res] = nums1[i];
                res++;
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println("result array : ");
        for (int k = 0; k < res; k++) {
            System.out.print(result[k] + " ");
        }

        sc.close();
    }
}
