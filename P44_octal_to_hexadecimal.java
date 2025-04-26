// WAP to convert an Octal into hexa-decimal.

import java.util.Scanner;

public class P44_octal_to_hexadecimal {

    public static int ToBinary(int n){
        int temp;
        int num = 0;
        int mul = 1;
        while (n > 0) {            
            temp = n % 2;
            if (temp > 7) {
                System.out.println("enter a valid octal number");
                break;
            }
            num = num + (temp * mul);
            mul = mul * 10;
            n = n / 2;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a octal number : ");
        int n = sc.nextInt();
        int bin = ToBinary(n);
        System.out.println("binary of "+n+" is "+bin);
        sc.close();
    }
}
