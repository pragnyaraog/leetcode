import java.util.*;
public class find_missing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=1;
        for(int i=0;i<n;i++){
            if(arr[i]!=j){
                System.out.println(j);
                break;
            }else{
                j++;
            }
        }
        /*HashSet<Integer> set = new HashSet<>();

for(int num : arr) {
    set.add(num);
}

for(int i = 1; i <= n + 1; i++) {
    if(!set.contains(i)) {
        System.out.println(i);
        break;
    }
} */
    }
}
