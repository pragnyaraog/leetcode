import java.util.*;
public class move_zeros_to_end {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
   /*  for(int i=0;i<n;i++){
        if(a[i]==0){
            for(int j=i+1;j<n;j++){
                if(a[j]!=0){
                   int  temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
                
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }*/
   int j=0;
   for(int i=0;i<n;i++){
    if(a[i]!=0){
        a[j++]=a[i];
    }
   }
   while(j<n){
    a[j++]=0;
   }
   for(int i=0;i<n;i++){
    System.out.print(a[i]+" ");
   }
}}
