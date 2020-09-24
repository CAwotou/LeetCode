import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combination(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (candidates.length == 0) {
            return res;
        }
        List<Integer> path = new ArrayList<Integer>();
        dfs(res, path, target, candidates, 0);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> path, int target, int candidates[], int index) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            dfs(res, path, target - candidates[i], candidates, i + 1);
            path.remove(path.size() - 1);
        }


    }

    public static void main(String[] args) {
        CombinationSum2 test = new CombinationSum2();
        int a[] = {2, 5, 2, 1, 2};
        System.out.println(test.combination(a, 5));
    }


}
