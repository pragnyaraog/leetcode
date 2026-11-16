import java.util.Scanner;
public class Floor_and_Ceil_in_Sorted_Array {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
     int l = 0, r = n - 1;
        int ceil = -1;
        int floor = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= x) {
                floor = nums[mid];  
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        l = 0; r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= x) {
                ceil = nums[mid];   
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

return new int[]{floor,ceil};
        
       }
       public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
              int n=sc.nextInt();
              int[] arr=new int[n];
              for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
              }
              int x=sc.nextInt();
              Floor_and_Ceil_in_Sorted_Array ob=new Floor_and_Ceil_in_Sorted_Array();
              int[] result=ob.getFloorAndCeil(arr, x);
              System.out.println("Floor index: " + result[0]);
              System.out.println("Ceil index: " + result[1]);
              sc.close();}
    }