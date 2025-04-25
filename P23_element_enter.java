// WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.Scanner;

public class P23_element_enter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the lenght of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            System.out.print("enter element " + (i) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("enter the index you want : ");
        int ind = sc.nextInt();
        System.out.print("enter the number you want : ");
        int num = sc.nextInt();

        System.out.println("original array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = n; i > ind; i = i - 1) {
            arr[i] = arr[i - 1];
        }

        arr[ind] = num;

        System.out.println("edited array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
