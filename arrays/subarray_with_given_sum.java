import java.util.*;

public class subarray_with_given_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < n; i++){
            int sum = 0;

            for(int j = i; j < n; j++){
                sum += arr[j];

                if(sum == t){
                    System.out.println((i+1) + " " + (j+1));
                    found = true;
                    break;
                }
            }

            if(found) break;
        }
    }
}