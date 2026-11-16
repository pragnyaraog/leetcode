import java.util.*;

class min_element{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  
         min=Math.min(min,arr[i]);
        }
        System.out.println("min element is:" + min);
    }
}