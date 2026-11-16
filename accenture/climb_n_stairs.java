package accenture;
import java.util.*;
public class climb_n_stairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        /*int r=(n/m)+(n%m);
        System.out.println(r);*/
        int[] dp=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=n;i++){
          if(dp[i-1]!=Integer.MAX_VALUE){
            dp[i]=Math.min(dp[i],dp[i-1]+1);
          }
        
    if(i>=m&&dp[i-m]!=Integer.MAX_VALUE){
            dp[i]=Math.min(dp[i],dp[i-m]+1);
        }}
        System.out.println(dp[n]);
    }
}
