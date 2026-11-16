import java.util.*;
public class check_sorted {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  }
         //Arrays.sort(arr);
         boolean b=false;
         for(int i=1;i<n;i++){
             if(arr[i]<arr[i-1]){
               b=true;
               break;
             }
             b=false;
         }
        System.out.println(b);
    }
    }
