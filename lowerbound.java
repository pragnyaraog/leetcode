class lowerbound {
    public int lowerBound(int[] nums, int x) {
       int l=0,u=nums.length-1;
       while(l<u){
        int mid=l+(u-l)/2;
        if(x>nums[mid]){
            l=mid+1;
        }
        else{
            u=mid;
        }
       }
       return l;
     }
}
