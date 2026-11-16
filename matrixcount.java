public class matrixcount {
    public static void main(String[] args){
        int r=3;
        int c=3;
        int[][] m={
            {1,0,0},
            {1,1,0},
            {1,1,1}
        };
        int count;
        int max=0;
        int k=0;
        for(int i=0;i<r;i++){
            count=0;
            for(int j=0;j<c;j++){
                if(m[i][j]==1){
                    count++;
                    if(count>max){
                        max=count;
                        k=i;
                    }}
            }
        }

        System.out.println(k+1);
    }
    
}
