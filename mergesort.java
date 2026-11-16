public class mergesort {
    public static void main(String[] args){
        int arr[]={5,3,8,4,2};
        int n=arr.length;
        mergesort1(arr,0,n-1);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    static void mergesort1(int arr[],int low,int high){
        if(low==high) return;
        int mid=(low+high)/2;
        mergesort1(arr,low,mid);
        mergesort1(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int arr[],int low,int mid,int high){
        int temp[]=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        if(i<=mid&&j<=high){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=high){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for(int p=low;p<=high;p++){
            arr[p]=temp[p-low];
        }
    }
}
