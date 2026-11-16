class Solution {
    public int[] minToMaxHeap(int[] nums) {
        int n=nums.length;
       for(int i=n/2-1;i>=0;i--){
        maxheapify(nums,i,n);
       }
       return nums;
    }
    public void maxheapify(int arr[],int i,int n){
        int g=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n&&arr[l]>arr[g]){
            g=l;
        }
        if(r<n&&arr[r]>arr[g]){
            g=r;
        }
        if(g!=i){
            swap(arr,i,g);
            maxheapify(arr,g,n);
        }
    }
    public void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}