import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> sum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (candidates.length == 0) {
            return res;
        }
        List<Integer> combine = new ArrayList<Integer>();
        dfs(candidates, target, res, combine, 0);
        return res;
    }

    public void dfs(int candidates[], int target, List<List<Integer>> res, List<Integer> combine, int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(combine));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            combine.add(candidates[i]);
            dfs(candidates, target - candidates[i], res, combine, i);
            combine.remove(combine.size() - 1);
        }


    }

    public static void main(String[] args) {
        CombinationSum test = new CombinationSum();
        int a[] = {2, 3, 6, 7};
        System.out.println(test.sum(a, 7));
    }
}
