import java.util.Scanner;

public class second_largest_evenoddplaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[10];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(a[i]>max1){
                    max2=max1;
                    max1=a[i];
                }
                else if(a[i]>max2 && a[i]!=max1){
                    max2=a[i];
                }
            }

            if(i%2!=0){
                if(a[i]<min1){
                    min2=min1;
                    min1=a[i];
                }
                else if(a[i]<min2 && a[i]!=min1){
                    min2=a[i];
                }
            }
        }
        System.out.println("second largest: "+max2);
        System.out.println("second smallest: "+min2);
        System.out.println(min2+max2);
    }
}
