public class d7prime {
    public static void main(String[] args){
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
            System.out.println(j);
            break;
        }}
    }
    
}
