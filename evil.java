public class evil {
    public static void main(String[] args){
        int c=0;
        int n=9;
        int temp=n;
        int b=0;
        int place=1;
                while (temp > 0) {
            b += (temp % 2) * place;
            place *= 10;
            temp /= 2;
        }
while(b>0){
    int d=b%10;
    if(d==1){
        c++;
    }
    b=b/10;
}
if(c%2==0)
    System.out.println("evil");
else
    System.out.println("not evil");

    }
}
