public class coeffremarray {
public static void main(String[] args){
    int[] arr={10,20,30};
    int n=arr.length;
    int coeff[] =new int[arr.length];
    for(int i=0;i<arr.length;i++){
        coeff[i]=arr[i]%n;
        System.out.println("coeff"+coeff[i]);
    }
    int rem[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        rem[i]=arr[i]/n;
        System.out.println("rem"+rem[i]);
    }
}}
