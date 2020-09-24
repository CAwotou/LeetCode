public class MaxSubArray {
    public int maxSub(int nums[]){
        int MaxSum=nums[0];
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre=pre+nums[i];
            if(pre>MaxSum){
                MaxSum=pre;
            }
            if(pre<0){
                pre=0;
            }
        }
        return MaxSum;
    }
    public static void main(String[] args) {
        MaxSubArray test=new MaxSubArray();
        int a[]={ -2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test.maxSub(a));
    }
}
