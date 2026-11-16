import java.util.*;

public class two_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        int t=sc.nextInt();
        while(i<j){
            if(a[i]+a[j]>t){
j--;
            }else if(a[i]+a[j]<t){
                i++;
            }
            else{
                System.out.println((i+1)+" "+(j+1));
                break;
            }
        }
    }
}
