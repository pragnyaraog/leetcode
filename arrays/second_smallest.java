import java.util.*;
public class second_smallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
       int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
             if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
            System.out.println("Second smallest element is: " + secondMin);
    }
}
