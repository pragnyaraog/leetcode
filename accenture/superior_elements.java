import java.util.*;
class superior_elements{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] =new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[n-1];
    int c=1;
    /*for(int i=0;i<n;i++){
        max=arr[i];
        for(int j=i+1;j<n;j++){
            if(arr[j]>max){
                max=arr[j];
            }
        }
        if(arr[i]==max){
          c++;
        }
    }*/
   for(int i=n-2;i>=0;i--){
    if(arr[i]>max){
        max=arr[i];
        c++;
    }
   }
    System.out.println(c);
}
}