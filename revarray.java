public class revarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int i=0;
        int j=arr.length-1;
         for(i = 0; i < j; i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
        }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }
}
