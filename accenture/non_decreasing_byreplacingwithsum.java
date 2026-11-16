package accenture;
import java.util.*;
public class non_decreasing_byreplacingwithsum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int c=0;
        long prev=0;
          long curr=0;
        for(int i=0;i<n-1;i++){
               curr+=a[i];
               if(curr>=prev){
                prev=curr;
                curr=0;
                c++;
               }
        }
        System.out.println(c);
    }
}
