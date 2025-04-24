// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)

import java.util.Scanner;

public class P13_matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Matrix 1: ");
        int n = sc.nextInt();
        System.out.print("Enter columns of Matrix 1: ");
        int m = sc.nextInt();

        System.out.print("Enter columns of Matrix 2: ");
        int p = sc.nextInt();

        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[m][p];
        int[][] res = new int[n][p];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter values of " + i + "th row and " + j + "th col Matrix 1 : ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.println("Enter values of " + i + "th row and " + j + "th col Matrix 2 : ");
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                res[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
