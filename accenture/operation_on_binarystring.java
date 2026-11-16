package accenture;
import java.util.*;
public class operation_on_binarystring {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int r = s.charAt(0) - '0';
        for(int i=1;i<s.length();i+=2){
            char op=s.charAt(i);
            int n=s.charAt(i+1)-'0';
            if(op=='A'){
                r=r|n;
            }
            else if(op=='B'){
                r=r&n;
            }
            else if(op=='C'){
                r=r^n;
            }
        }
        System.out.println(r);
    }
}
