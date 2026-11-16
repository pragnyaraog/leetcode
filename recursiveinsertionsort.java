public class recursiveinsertionsort {
    public static void main(String[] args){
        int arr[]={5,4,9,6,2};
        int n=arr.length;
        recursiveinsertsort(arr,n);
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    static void recursiveinsertsort(int arr[],int n){
         for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
