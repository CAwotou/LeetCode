public class MinPatches {
    public int min(int[] nums, int n) {
        int patches = 0;
        long x = 1;
        int length = nums.length, index = 0;
        while (x <= n) {
            if (index < length && nums[index] <= x) {
                x += nums[index];
                index++;
            } else {
                x *= 2;
                patches++;
            }
        }
        return patches;
    }

    public static void main(String[] args) {
        MinPatches test = new MinPatches();
        int[] a = {1, 3};
        System.out.println(test.min(a, 6));
    }

}
