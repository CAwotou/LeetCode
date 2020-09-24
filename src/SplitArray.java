public class SplitArray {
    public int split(int nums[],int m){
        int left=0,right=0;
        for(int i=0;i<nums.length;i++){
            right+=nums[i];
            if(left<nums[i]){
                left=nums[i];
            }
        }
        while(left<right){
            int mid=(right+left)/2;
            if(check(nums,mid,m)){
                right=mid;
            }
            else {
                left=mid+1;
            }
        }
        return left;
    }

    public boolean check(int nums[],int mid,int m){
        int sum=0;//当前分割子数组的和
        int cnt=1;//以及分割出的子数组的数量
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                cnt++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        return cnt<=m;
    }
}
