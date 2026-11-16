public class maxarray {
    public static void main(String[] args){
        int[] arr={1,5,3,9,2,8};
        int max=arr[0];
        int min=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}
