import java.util.*;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long f1=0,f2=1,f;
    for(long i=0;i<n;i++){
        System.out.print(f1+" ");
        f=f1+f2;
        f1=f2;
        f2=f;
    }

    }
}
