public class bubblesort {
    public static void main(String[] args){
        int arr[]={5,3,8,4,2};
        int n=arr.length;
       for(int i=0;i<n-1;i++){
        for (int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;

            }}
        }
         for(int k=0;k<n;k++){
              System.out.println(arr[k]);
       }
        /*int arr[]={15,34,25,12,22,11,90};
        int n=arr.length;
        int i=0;
        while(i<n-1){
            int j=0;
            while(j<n-1-i){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                j++;
            }
            i++;
        }

        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }*/
    }
}
