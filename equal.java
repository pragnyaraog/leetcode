public class equal {
      public static void main(String[] args){
        String s="##*#***";
        int count1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                count1++;
            }
            if(s.charAt(i)=='*'){
                count1--;
            }
        }
        if(count1==0){
            System.out.println(0);
        }
        else{
            System.out.println(1);
        }
    }
    
}
