// WAP to sort an Array using Selection sort. 

import java.util.Scanner;

public class P18_selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("original array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // SELECTION SORT
        for (int i = 0; i < n - 1; i++) {
            int temp;
            int minInd = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minInd]) {
                    minInd = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        System.out.println();
        System.out.println("Selection Sort array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
