import java.util.Scanner;
public class octal_to_decimal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int c=0;
        while(n>0){
            int r=n%10;
            d=d+r*(int)Math.pow(8,c);
            c++;
            n=n/10;
        }
        System.out.println(d);
    }
}
