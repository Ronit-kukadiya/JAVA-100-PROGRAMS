// WAP to find whether string is palindrome or not. 

import java.util.Scanner;
class P2_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = sc.next();

        char[] myArr = str.toCharArray();
        char[] check = new char[myArr.length];
        int j = myArr.length - 1;
        int count = 0;

        for (int i = 0; i < myArr.length; i++) {
            check[j] = myArr[i];
            j--;
        }

        for (int i = 0; i < check.length; i++) {
            if (check[i] == myArr[i]) {
                continue;
            } else {
                count = count + 1;
            }
        }

        if (count == 0) {
            System.out.println("string IS palindrome");
        } else {
            System.out.println("string IS NOT palindrome");
        }
        sc.close();
    }
}