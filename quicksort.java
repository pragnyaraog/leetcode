public class quicksort{
    public static void main(String[] args){
        int arr[]={5,3,8,4,2};
        int n=arr.length;
        quicksort1(arr,0,n-1);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    static void quicksort1(int arr[],int low,int high){
        if(low>=high) return;
        int pivot=partition(arr,low,high);
        quicksort1(arr,low,pivot-1);
        quicksort1(arr,pivot+1,high);
    }
    static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}