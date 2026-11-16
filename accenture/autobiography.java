import java.util.*;
class autobiography{
    public static int count(String s){
        int n=s.length();
        int[] freq=new int[10];
        for(char c:s.toCharArray()){
            freq[c-'0']++;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)-'0'!=freq[i]){
                return 0;
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(freq[i]>0){
                c++;
            }
        }
            return c;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(count(s));
    }
}