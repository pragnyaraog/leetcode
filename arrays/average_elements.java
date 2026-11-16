 import java.util.*;
 public class average_elements{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();  
        }
        average(arr,n);
 }
 static void average(int[] arr,int n){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    double average=(double)sum/n;
    System.out.printf("average of elements is: %.2f%n", average);
 }
}
