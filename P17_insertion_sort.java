// WAP to sort an Array using insertion sort.

import java.util.Scanner;

public class P17_insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("ente element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("original array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // INSERTION SORT
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println();
        System.out.println("Insertion Sort array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
