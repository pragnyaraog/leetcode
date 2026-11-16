package accenture;
import java.util.*;
public class diff_num_count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int num=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++){
            if(Math.abs(a[i]-num)<=d){
                c++;
            }
        }
        System.out.println(c);
    }
}
