import java.util.*;

public class max_element {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  
        }
        max(arr);
    }
    static void max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println("max element is:" + max);
    }
}
