import java.util.*;

public class mergeintervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][2];

        for(int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }

        // sort
        Arrays.sort(a, (x, y) -> x[0] - y[0]);

        System.out.print("Merged intervals: ");

        int s = a[0][0], e = a[0][1];

        for(int i = 1; i < n; i++) {
            if(a[i][0] <= e) {
                e = Math.max(e, a[i][1]);
            } else {
                System.out.print("[" + s + ", " + e + "] ");
                s = a[i][0];
                e = a[i][1];
            }
        }

        System.out.print("[" + s + ", " + e + "] ");
    }
}