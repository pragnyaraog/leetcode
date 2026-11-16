class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int sum;
        int r=0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int p : piles) {
        max = Math.max(max, p);}
        for(int k=1;k<=max;k++){
            sum=0;
            for(int i=0;i<piles.length;i++){
            if(piles[i]%k==0){
                r=piles[i]/k;
                sum=sum+r;
            }
            else{
            r=piles[i]/k;
sum=sum+1+r;
            }
        }
        if(sum<=h){
           min=k;
           break;
        }
        }
        return min;
    }
}