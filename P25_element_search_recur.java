// WAP  to  check  weather  number  is  present  in  array  or  not  (using  recursion  only)  and  the 
// function’s syntax is given below 
// Int isInArray(int a[],int m);  
// Where int a[] is Array of integer and m is element to be searched.   

import java.util.Scanner;

public class P25_element_search_recur {

    public static int isInArray(int arr[], int m, int i) {
        int j = i;
        if (j >= arr.length) {
            return -1;
        }
        if (m == arr[j]) {
            return j;
        } else {
            return isInArray(arr, m, j + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenght of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the element to search : ");
        int m = sc.nextInt();

        int a = isInArray(arr, m, 0);
        if (a == -1) {
            System.out.println("element NOT found");
        } else {
            System.out.println("element found on " + a + " is " + arr[a]);
        }

        sc.close();
    }
}
