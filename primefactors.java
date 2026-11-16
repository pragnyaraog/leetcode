public class primefactors {
    public static void main(String[] args){
        int n=28;
        for(int i=1;i<=n;i++){
    if(n%i==0){
        boolean isPrime=true;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime && i!=1){
            System.out.println(i);
        }
    }
}
    }
}
