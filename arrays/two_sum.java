import java.util.*;
public class two_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        /*int sum=0;
        for(int i=0;i<n;i++){
           sum=0;
            for(int j=i+1;j<n;j++){
                sum=a[i]+a[j];
                if(sum==target){
                    System.out.println(i+" "+j);
                }
            }
        }*/
      /*  HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        int c=target-a[i];
        if(map.containsKey(c)){
            System.out.println(map.get(c)+" "+i);
        }
        else{
            map.put(a[i],i);
        }
       }*/
      int i=0;
      int j=n-1;
      Arrays.sort(a);
      while(i<j){
        int sum=a[i]+a[j];
        if(sum==target){
            System.out.println(i+" "+j);
            break;
        }
        else if(sum<target){
            i++;
        }
        else{
            j--;
        }
      }
    }
}
