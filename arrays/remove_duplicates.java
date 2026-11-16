import java.util.*;
public class remove_duplicates {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  
        }
        /*for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                      for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                      }
                      n--;
                      j--;
                }
            }
        }*/
       /*int[] res=new int[n];
       int k=0;
       for(int i=0;i<n;i++){
        int j=0;
        while(j<i){
            if(arr[i]==arr[j] && i!=j){
                break;
            }
            j++;
        }
    if(i==j){
        res[k++]=arr[i];
       }}*/
     HashSet<Integer> set=new HashSet<>();
     for(int i=0;i<n;i++){
        set.add(arr[i]);
     }
     for(int num : set){
        System.out.print(num+" ");
     }
    }
    
}
