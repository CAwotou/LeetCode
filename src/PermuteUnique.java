import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        if(len==0){
            return res;
        }
        boolean []visited=new boolean[len];
        Arrays.sort(nums);
        helper(nums,res,new ArrayList<>(),visited,len);
        return res;
    }

    public void helper(int []nums,List<List<Integer>> res,List<Integer> cur,boolean visited[],int len){
        if (cur.size()==len){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=0;i<len;i++){
           if(visited[i]){
              continue;
           }
           if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]){
               continue;
           }
           cur.add(nums[i]);
           visited[i]=true;
           helper(nums, res, cur, visited,len);
           cur.remove(cur.size()-1);
           visited[i]=false;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,1,2};
        PermuteUnique test=new PermuteUnique();
        System.out.println(test.permute(nums));
        System.out.println(test.permute(nums).size());
    }
}
