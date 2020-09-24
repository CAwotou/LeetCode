public class PredictTheWinner {
    public boolean Predict(int nums[]){
        return total(nums,0,nums.length-1,1)>=0;
    }

    public int total(int nums[],int start,int end,int turn){
        //玩家1分数为正，玩家2分数为负
        if(start==end){
            return nums[start]*turn;
        }
        int scoreStart=nums[start]*turn+total(nums,start+1,end,-turn);
        int scoreEnd=nums[end]*turn+total(nums,start,end-1,-turn);
        return Math.max(scoreStart*turn,scoreEnd*turn)*turn;
    }

    public static void main(String[] args) {
        int nums[]={1, 5, 233, 5, 87};
        PredictTheWinner test=new PredictTheWinner();
        System.out.println(test.Predict(nums));
    }

}
