
import java.util.*;
public class password_checker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        System.out.println(password(n,s));
    }
    public static int password(int n,String s){
          if(n<4)  return 0;
          if(Character.isDigit(s.charAt(0))) return 0;
          boolean hu=false,hd=false;
          for(int i=0;i<n;i++){
            if(s.charAt(i)==' '||s.charAt(i)=='/') return 0;
            if(Character.isUpperCase(s.charAt(i))) hu=true;
            if(Character.isDigit(s.charAt(i))) hd=true;
          }
          if(hu&&hd) return 1;
          else return 0;
    } 
}
