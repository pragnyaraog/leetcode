public class d10primepalindrome {
     public static void main(String[] args) {

        int n=10000000;
        for(int j=1000000;j<n;j++){
            boolean isPrime=true;
        for(int i=2;i<j/2;i++){
            if(j%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
int r=0;
        int temp=j;
        while(temp>0){
            int d=temp%10;
            r=r*10+d;
            temp=temp/10;
        }
        if(r==j){
            System.out.println(j);
            break;
            
        }}

    }
}}
