public class eosortarray {
    public static void main(String[] args){
        int[] arr={1,2,5,8,6};
        int i=0;
        int j=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
            for(j=i+1;j<arr.length;j++){
                if(arr[j]%2==0){
                   int temp=arr[i];
                   arr[i]=arr[j];
                     arr[j]=temp;
                    }
                }}
            }
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);}
        }
    }
