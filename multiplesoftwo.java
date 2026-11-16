import java.util.HashSet;

public class multiplesoftwo {
    public static void main(String[] args){
        int n=10,k=0,p=0;
        int[] arr=new int[n];
        int[] res=new int[n];
        for(int i=1;i<=n;i++){
            if(i%3==0){
                arr[k]=i;
                k++;
            }
            if(i%5==0){
                arr[k]=i;
                k++;
            }
        }
        int sum=0;
        HashSet<Integer> s = new HashSet<>();
        int idx = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (!s.contains(arr[i])) { 
                s.add(arr[i]);  
                arr[idx++] = arr[i];  
            }
        }

        for(int i=0;i<arr.length;i++)
{
            sum=sum+arr[i];
        }
    
    if(sum!=0){
        System.out.println(sum);
    }
}   }

