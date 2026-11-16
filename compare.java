public class compare {
    public static void main(String[] args) {
        int a[]={7,4,8,2,9};
int max=a[0];
int c=1;
for(int i=1;i<a.length;i++){
    if(a[i]>max){
        max=a[i];
        c+=1;
    }
}
System.out.println("Maximum element is: "+c);
}  
}
