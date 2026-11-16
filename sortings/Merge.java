import java.util.*;
public class Merge{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
    a[i]=sc.nextInt();
}
mergesort(a,n);
for(int i=0;i<n;i++){
    System.out.print(a[i]+" ");}
}
public static void mergesort(int a[],int n){
    if(n<2) return;
    int m=n/2;
    int[] l=new int[m];
    int[] r=new int[n-m];
    for(int i=0;i<m;i++){
        l[i]=a[i];
    }
    for(int i=m;i<n;i++){
    r[i-m]=a[i];
    }
    mergesort(l,m);
    mergesort(r,n-m);
    merge(l,r,m,n-m,a);}
    public static void merge(int[] l,int[] r,int m,int n,int[] a){
        int k=0, i=0, j=0;
        while(i<m&&j<n){
            if(l[i]<=r[j]){
                a[k++]=l[i++];
            }
            else{
                a[k++]=r[j++];
            }}
            while(i<m){
                a[k++]=l[i++];
            }
            while(j<n){
                a[k++]=r[j++];
            }
        }
    }
