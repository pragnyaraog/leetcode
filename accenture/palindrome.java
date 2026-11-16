import java.util.*;
class palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int u=sc.nextInt();
for(int i=l;i<=u;i++){
    int num = i;
     int original = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        if (original == rev) {
            System.out.println(i);
        }
}

}
}