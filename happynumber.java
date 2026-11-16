public class happynumber {
    public boolean isHappy(int n) {
        int r;
        while (n != 1 && n != 4) {
            r=0;
        while(n>0){
           int d=n%10;
           r=d*d+r;
           n=n/10;
    }
    n=r;
        }
        return n==1;
    }
    } 
