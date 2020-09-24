import java.util.Arrays;

public class GetPermutation {
    int factorial[];
    boolean used[];


    public String get(int n, int k) {
        used = new boolean[n + 1];
        Arrays.fill(used, false);
        calculateFactorial(n);
        StringBuffer sb = new StringBuffer();
        dfs(0, sb, n, k);
        return sb.toString();
    }

    public void dfs(int index, StringBuffer sb, int n, int k) {
        if (index == n) {
            return;
        }
        int cnt = factorial[n - 1 - index];
        for (int i = 1; i <= n; i++) {
            if (used[i]) {
                continue;
            }
            if (cnt < k) {
                k = k - cnt;
                continue;
            }
            sb.append(i);
            used[i] = true;
            dfs(index + 1, sb, n, k);
            return;
        }
    }

    public void calculateFactorial(int n) {
        factorial = new int[n + 1];
        factorial[0] = 1;//从0的阶乘开始
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
    }

    public static void main(String[] args) {
        GetPermutation test = new GetPermutation();
        System.out.println(test.get(9, 1));

    }


}
