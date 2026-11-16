public class swapadjacentarray {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
