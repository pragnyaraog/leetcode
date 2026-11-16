import java.util.*;

public class week3q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();

        int ans = a[0] + a[1] + a[2];

        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                for(int k = j + 1; k < n; k++) {

                    int sum = a[i] + a[j] + a[k];

                    if(Math.abs(target - sum) < Math.abs(target - ans)) {
                        ans = sum;
                    }
                }
            }
        }

        System.out.println("The sum closest to the target is: " + ans);
    }
}