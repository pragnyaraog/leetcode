import java.util.Scanner;
public class upperbound {
    public int upperBound(int[] nums, int x) {
  int l=0,u=nums.length-1;
  while(l<u){
    int mid=l+(u-l)/2;
    if(x>=nums[mid]){
        l=mid+1;
    }
    else{
        u=mid;
    }
  }
  return l;
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        upperbound ob=new upperbound();
        System.out.println(ob.upperBound(arr, x));
        sc.close();   
    }
}
