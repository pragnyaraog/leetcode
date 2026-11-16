import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        int c=0;
        while(p>0){
            p=p/10;
            c++;
        }
        int s=0;
        int t=n;
        while(t>0){
            int d=t%10;
            s=s+(int)Math.pow(d, c);
            t=t/10;
        }
        if(s==n){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an Armstrong number");
        }

    }
}
