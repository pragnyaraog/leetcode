public class neon {
    public static void main(String[] args){
        int n=9;
        int r=n*n;
        int sum=0;
        for(int i=0;i<r;i++){
            int d=r%10;
            sum=sum+d;
            r=r/10;
        }
        if(sum==n){
            System.out.println(n+" is a neon number");
        }
        else{
            System.out.println(n+" is not a neon number");
        }
    }
}
