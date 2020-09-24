import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> generate(int nums[]) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 1) {
            return res;
        }
        helper(res, new ArrayList<>(),nums,new boolean[nums.length]);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> cur, int nums[], boolean visited[]) {
        if (cur.size() == nums.length) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {//初始为false
                continue;//进行下一次循环
            }
            cur.add(nums[i]);
            visited[i]=true;
            helper(res,cur,nums,visited);
            cur.remove(cur.size()-1);
            visited[i]=false;

        }

    }

    public static void main(String[] args) {
        int a[]={1,2,3,4};
        Permute test=new Permute();
        System.out.println(test.generate(a));
    }
}
