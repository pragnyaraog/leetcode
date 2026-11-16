import java.util.*;
class dp_fibonacci{
    static int f(int n,int[] dp){
        if(n<=1){
    return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=f(n-1,dp)+f(n-2,dp);
        return dp[n];
    }
public static void main(String[] args){
    int n=5;
    int[] dp=new int[n+1];
    Arrays.fill(dp,-1);
    f(n,dp);
    System.out.println(dp[n]);
}

}