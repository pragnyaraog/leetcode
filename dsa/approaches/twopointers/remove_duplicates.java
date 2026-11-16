import java.util.*;

public class remove_duplicates {
    public static void main(String[] args){
        int a[]={0,0,1,1,1,2,2,3,3,4};
        int n=a.length;
        int i=0;
        for(int j=i+1;j<n;j++){
            if(a[i]!=a[j]){
                i++;
                a[i]=a[j];
            }
        }
        for(int k=0;k<=i;k++){
            System.out.print(a[k]+" ");
        }
    }
}
