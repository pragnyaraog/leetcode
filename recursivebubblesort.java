public class recursivebubblesort {
    public static void main(String[] args){
        int arr[]={5,3,8,4,2};
        int n=arr.length;
        recursivebubblesort(arr,n);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    static void recursivebubblesort(int[] arr,int n){
for(int i=0;i<n-1;i++){
        for (int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }}
        }
        if(n-1==1){
            return;
        }
        recursivebubblesort(arr,n-1);
    }
}
