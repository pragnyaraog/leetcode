public class gstars {
    public static void main(String[] args){
          int r=4;
          int c=4;
        int m[][];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((i==1&&j==1)||i==2&&(j==1||j==2)){
System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
        System.out.println();
        }
    }
    
}
