import java.util.*;
public class merge_arrays {
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
         arr1[i]=sc.nextInt();  
        }
        int m=sc.nextInt();
        int[] arr2=new int[m];
        for(int i=0;i<m;i++){
         arr2[i]=sc.nextInt();  
        }
        int c[]=new int[n+m];
        for(int i=0;i<n;i++){
            c[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
            c[n+i]=arr2[i];
        }
        System.out.println("Merged array is: ");
        for(int i=0;i<n+m;i++){
            System.out.print(c[i]+" ");
        }
    }
}
