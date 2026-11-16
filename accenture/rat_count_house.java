package accenture;
import java.util.*;
public class rat_count_house {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.println(-1);
            return;
        }
        int[] a = new int[n];
        int r = sc.nextInt();
        int u = sc.nextInt();
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int req = r * u;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
            if(sum >= req){
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}