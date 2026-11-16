import java.util.*;
public class second_largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=0;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
             if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
            System.out.println("Second largest element is: " + secondMax);
    }
}
