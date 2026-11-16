import java.util.*;
public class intersection {
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
        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }*/
       HashSet<Integer> set=new HashSet<>();
      HashSet<Integer> res=new HashSet<>();
       for(int i=0;i<n;i++){
        set.add(arr[i]);
       }
       for(int i=0;i<m;i++){
        if(set.contains(arr2[i])){
            res.add(arr2[i]);
        }
       }
       for(int i: res){
        System.out.print(i+" ");
       }
    }
}
