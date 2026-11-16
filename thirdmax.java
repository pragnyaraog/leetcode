public class thirdmax {
    public static void main(String[] args) {
        int[] nums={3,2,1};
        int max=0;
        int p=0;
        int count=0;
        while (count<3) {
            count++;
            max=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]>max){
                max=nums[i];
p=i;
            }}
            nums[p]=0;
            System.out.println("The first maximum is "+max);
    }
        /*for(int i=0;i<nums.length;i++){
if(nums[i]>max){
    max=nums[i];
    nums[i]=0;
}
        System.out.println("The first distinct maximum is "+max);}*/
}
}
