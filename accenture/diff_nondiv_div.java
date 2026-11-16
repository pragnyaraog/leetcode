package accenture;
import java.util.*;
public class diff_nondiv_div {

    public static int findDifference(int n, int m) {
        int divSum = 0;
        int nonDivSum = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                divSum += i;
            else
                nonDivSum += i;
        }

        return nonDivSum - divSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(findDifference(n, m));
    }
}
