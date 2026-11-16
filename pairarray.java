public class pairarray {
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,10};
       int i=1;
    int j=arr.length-1;
         while(i<j){
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
              i+=2;
              j--;
         }
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
    }
}
}
