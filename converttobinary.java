public class converttobinary {
    public static void main(String[] args){
        int n=10;
        int bin=0;
         int pos=1;
        while(n>0){
            int rem=n%2;
            bin+=rem*pos;
            pos*=10;
            n=n/2;}
        System.out.println(bin);
    }
}
