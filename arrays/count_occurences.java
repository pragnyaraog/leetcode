 import java.util.*;
 public class count_occurences{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  }
         count(arr,n);
        
    }
    static void count(int[] arr,int n){
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
          System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
         }

    }
    
}
