import java.util.*;
public class union {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<m;i++){
            set.add(arr2[i]);
        }
        for(int i: set){
            System.out.print(i+" ");
        }
    }
}
