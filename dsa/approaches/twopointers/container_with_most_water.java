import java.util.*;
public class container_with_most_water {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int m=0;
        while(l<r){
         int c=Math.min(height[l],height[r])*(r-l);
         m=Math.max(c,m);
         if(height[l]<height[r]){
            l++;
         }
         else{r--;}
        }
        return m;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        container_with_most_water obj=new container_with_most_water();
        System.out.println(obj.maxArea(a));
    }
}
