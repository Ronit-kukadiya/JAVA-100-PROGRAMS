// WAP to find a sum of even number into 1D array

import java.util.Scanner;

class P1_even_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array length:");
        int n = sc.nextInt();

        int sum = 0;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + ",");
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("sum of even elements is : " + sum);
        sc.close();
    }

}