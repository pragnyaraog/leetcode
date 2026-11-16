import java.util.*;

public class valid_palindrome {

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        valid_palindrome obj=new valid_palindrome();
        System.out.println(obj.isPalindrome(s));
    }
}
