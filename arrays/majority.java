import java.util.*;
public class majority {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int candidate = 0;
int count = 0;

for(int num : arr){
    if(count == 0){
        candidate = num;
    }

    if(num == candidate){
        count++;
    }else{
        count--;
    }
}

System.out.println(candidate);
        /*HashMap<Integer, Integer> set=new HashMap<>();
        for(int i=0;i<n;i++){
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : set.entrySet()) {
            if(entry.getValue() > n / 2) {
                System.out.println(entry.getKey());
                return;
            }
        }*/

    }
}
