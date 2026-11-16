package accenture;
import java.util.*;
public class element_repeated {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements");
            a[i]=sc.nextInt();
        }
        /*int repeated=0;
         for(int i=0;i<n;i++){
         boolean alreadyCounted = false;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                   alreadyCounted = true;
                    break;
                }
            }
                 if(alreadyCounted)
                continue;

            int count = 0;
            for(int j = i; j < n; j++) {
                if(a[i] == a[j])
                    count++;
            }
            if(count > 1)
                repeated++;
         }
         System.out.println(repeated);*/
         /*HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int c=0;
         for(int f:map.values){
            if(f>1){
                c++;
            }
         }
         System.out.println(c);*/
         Arrays.sort(a);
         int c=0;
         for(int i=0;i<n-1;i++){
            if(a[i]==a[i+1]){
                c++;
                while(i<n-1&&a[i]==a[i+1]){
                    i++;
                }
            }
         }
            System.out.println(c);
    }
}
