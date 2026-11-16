import java.util.*;
public class longest_subsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
       /*  Arrays.sort(arr);
        int c=1;
        int d=1;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]) {
                continue; 
            }
            if(arr[i]-arr[i-1]==1){
                c++;
            }
            else{
                c=1;
            }
            d=Math.max(d, c);
        }
        System.out.println(d);*/

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);

        int max = 0;

        for(int x : set){

            if(!set.contains(x - 1)){
                int curr = x;
                int len = 1;

                while(set.contains(curr + 1)){
                    curr++;
                    len++;
                }

                max = Math.max(max, len);
            }
        }

        System.out.println(max);
    
   }
}
