// Given an array nums with n integers, your task is to check if it could become non-decreasing 
// by modifying at most one 
// Input: nums = [4,2,3] 
// Output: true 
// Explanation: You could modify the first 4 to 1 to get a non-decreasing array. 

import java.util.Scanner;

public class P40_array_non_decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
                if (count > 1) {
                    System.out.println("False it could NOT become Increasing : " + false);
                    break;
                }
                if (i > 0 && arr[i - 1] > arr[i + 1]) {
                    arr[i + 1] = arr[i];
                } else {
                    arr[i] = arr[i + 1];
                }
            }
        }
        if (count == 0) {
            System.out.println("IT IS already Increasing ");
        } else if (count == 1) {
            System.out.println("True it could become Increasing : " + true);
        }

        sc.close();
    }
}