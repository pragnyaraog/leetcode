import java.util.*;
public class rotate_array {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] r=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            r[n-k+i]=arr[i];
        }
        for(int i=k;i<n;i++){
            r[i-k]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(r[i]+" ");
        }
    }
}
