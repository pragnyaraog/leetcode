import java.util.*;
public class replace_chars {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        char[] c=str.toCharArray();
        for(int i=0;i<n;i++){
            if(c[i]==ch1){
                c[i]=ch2;
            }
            else if(c[i]==ch2){
                c[i]=ch1;            }
        }
        System.out.println(new String(c));
    }
}
