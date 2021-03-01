public class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }

    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }

    public static void main(String[] args) {
        int[] a={-2, 0, 3, -5, 2, -1};
        NumArray test=new NumArray(a);
        System.out.println(test.sumRange(0,2));
        System.out.println(test.sumRange(2,5));
        System.out.println(test.sumRange(0,5));
    }

}
