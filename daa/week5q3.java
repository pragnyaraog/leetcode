package daa;

public class week5q3 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] C = new int[n][n];

        // input A
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();

        // input B
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                B[i][j] = sc.nextInt();

        // multiply
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // print result
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(C[i][j] % 2 == 0)
                    System.out.print(C[i][j] + " ");
                else
                    System.out.print("1 ");
            }
            System.out.print(" ");
        }
    }
}
