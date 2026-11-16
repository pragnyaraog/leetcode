public class primes
{
    static int pow(int b,int ex){
        int p=1;
        for(int i=0;i<ex;i++)
            p=p*b;
        return p;
    }
    static int len(int n){
        int l=0;
        while(n!=0){
            l++;
            n/=10;
        }
        return l;
    }
    
    static void prime1(int n){
        int c=0;
        for(int i=2;i<n/2+1;i++){
            c++;
            if(n%i==0){
                System.out.println(n+" is not a prime");
                return;
            }
        }
        System.out.println(n+" is a prime, itr->"+c);
    }
    
    static void prime2(int n){
        int c=0;
        for(int i=2;i*i<=n;i++){
            c++;
            if(n%i==0){
                System.out.println(n+" is not a prime");
                return;
            }
        }
        System.out.println(n+" is a prime, itr->"+c);
    }
    
    static boolean prime3(int n){
        int c=1;
        if(n==2 || n==3){
            //System.out.println(n+" is a prime, itr->"+c);
            return true;
        }
        if(n%2==0 || n%3==0){
            //System.out.println(n+" is not a prime");
            return false;
        }
        for(int i=5;i*i<=n;i+=6){
            c++;
            if(n%i==0 || n%(i+2)==0){
                //System.out.println(n+" is not a prime");
                return false;
            }
        }
        //System.out.println(n+" is a prime, itr->"+c);
        return true;
    }
	public static void main(String[] args) {
	    int i=10000;
	    int c=0;
	    while(c<10){
	        i--;
	        if(prime3(i)){
    	        c++;
    	        System.out.println(c+"->"+i);
	        }
	            
	    }
	    System.out.println(i);
	    
	    
	}
}