import java.util.*;

public class week5q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // input matrix
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
                B[i][j] = A[i][j] * A[i][j]; // square each element
            }
        }

        // multiply B * B
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    C[i][j] += B[i][k] * B[k][j];
                }
            }
        }

        System.out.print("Resultant Matrix: ");

        // print result
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print(" ");
        }
    }
}