import java.util.*;
public class find_duplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                    break;
                }
            }
        }*/
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<n;i++){
        if(set.contains(arr[i])){
            System.out.print(arr[i]+" ");
        }
        else{
            set.add(arr[i]);
         }
       }

    }
}
