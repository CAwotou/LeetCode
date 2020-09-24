import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    public List<List<Integer>> combination(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(res, path, k, n, 1);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> path, int k, int target, int index) {
        if (k == 0 && target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (k < 0 || target < 0) {
            return;
        }
        for (int i = index; i <= 9; i++) {
            if (target - i < 0) {
                break;
            }
            path.add(i);
            k--;
            helper(res, path, k, target - i, i + 1);
            path.remove(path.size() - 1);
            k++;
        }
    }

    public static void main(String[] args) {
        CombinationSum3 test = new CombinationSum3();
        System.out.println(test.combination(3, 15));
    }
}
