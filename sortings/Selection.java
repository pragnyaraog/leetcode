import java.util.*;
public class Selection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int p=0;
        for(int i=0;i<n;i++){
int min=Integer.MAX_VALUE;
p=i;
for(int j=i;j<n;j++){
if(min>a[j]){
    min=a[j];
    p=j;
}
}
int t=a[i];
a[i]=min;
a[p]=t;
        }
        for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");}
    }
}
