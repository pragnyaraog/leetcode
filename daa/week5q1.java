package daa;

public class week5q1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // input matrix A
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // input matrix B
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // multiply matrices
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // print result with tab space
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.print(" ");
        }
    }
}

