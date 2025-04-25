// WAP to delete an element from array specified by user. if element is not found print a 
// message “Element is not found” (do not take a new array).

import java.util.Scanner;

public class P24_element_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("original elements : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("enter the element you want to delete : ");
        int del = sc.nextInt();

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == del) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            for (int j = pos; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            n = n - 1;
            System.out.println("new array");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
