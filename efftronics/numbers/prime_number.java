import java.util.*;

public class prime_number {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        if(n<=1){
            System.out.println(n+" is not a prime number");
            return;
        }
        for(long i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println(n+" is not a prime number");
                return;
            }
        }
        System.out.println(n+" is a prime number");
    }
}
