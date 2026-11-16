import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long p=n;
        long r=0;
        while(p>0){
            long d=p%10;
             r=r*10+d;
            p=p/10;
        }
        if(r==n){
            System.out.println(n+" is a palindrome number");
        }
        else{
            System.out.println(n+" is not a palindrome number");
        }
        
    }
}
