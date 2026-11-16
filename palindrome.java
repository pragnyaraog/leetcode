public class palindrome {
    public static void main(String[] args){
        int n=122;
        int r=0;
        int temp=n;
        while(temp>0){
            int d=temp%10;
            r=r*10+d;
            temp=temp/10;
        }
        if(r==n){
            System.out.println(n+" is a palindrome");
        }
        else{
            System.out.println(n+" is not a palindrome");
        }
    }
}
