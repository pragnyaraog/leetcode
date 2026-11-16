import java.util.*;
public class binarysearchstring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String key=sc.next();
        boolean found=false;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid].equals(key)){
                System.out.println("Element found at index: "+mid);
                found=true;
                return;
            }
            else if(arr[mid].compareTo(key)<0){
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