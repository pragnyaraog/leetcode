import java.util.*;
class check_existence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==t){
                System.out.println("Element exists in the array");
                return;
            }
        }
        System.out.println("Element does not exist in the array");
    }
}
