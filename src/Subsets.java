import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> sub(int []nums) {
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        helper(0,nums,res,new ArrayList<Integer>(),len);
        return res;
    }

    public void helper(int index,int []nums,List<List<Integer>> res,List<Integer> cur,int len){
        res.add(new ArrayList<>(cur));
        for(int j=index;j<len;j++){
           cur.add(nums[j]);
           helper(j+1,nums,res,cur,len);
           cur.remove(cur.size()-1);
        }
    }

    public static void main(String[] args) {
        int []a={1,2,3};
        Subsets test=new Subsets();
        System.out.println(test.sub(a));
    }
}
