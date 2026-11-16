import java.util.*;

public class binarysearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0,high=n-1;
        int key=sc.nextInt();
        boolean found=false;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                System.out.println("Element found at index: "+mid);
                found=true;
                return;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found in the array.");
        }
    }
}
