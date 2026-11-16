import java.util.*;
public class Quick{
    public static int p(int[] a,int b,int e){
        int pi=a[e];
        int i=b-1;
        for(int j=b;j<e;j++){
            if(a[j]<pi){
                i++;
                swap(a,i,j);}
            
        }
          swap(a,i+1,e);
        return i+1;
    }
    public static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void q(int[] a,int b,int e){
      if(b<e){
        int pp=p(a,b,e);
        q(a,b,pp-1);
        q(a,pp+1,e);
      }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        q(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}