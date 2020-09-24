import java.util.*;

public class Combine {
    public List<List<Integer>> com(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if (k <= 0 || n < k) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;

    }

    public void dfs(int n, int k, int begin, Deque<Integer> path, List<List<Integer>> res) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n-(k-path.size())+1; i++) {
            path.addLast(i);
            System.out.println(path);
            dfs(n, k, i + 1, path, res);
            System.out.println("before："+path);
            path.removeLast();//删除队列最后一个元素
            System.out.println("after："+path);
        }

    }

    public static void main(String[] args) {
        Combine test = new Combine();
        System.out.println(test.com(5, 3));
    }
}
