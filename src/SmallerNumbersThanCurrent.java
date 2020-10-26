/**
 * @author hjs
 */
public class SmallerNumbersThanCurrent {
    public int[] smaller(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    cnt++;
                }
            }
            res[i] = cnt;
        }
        return res;
    }

    public static void main(String[] args) {
        SmallerNumbersThanCurrent test=new SmallerNumbersThanCurrent();
        int a[]={8,1,2,2,3};
        int len=a.length;
        for(int i=0;i<len;i++){
            System.out.println(test.smaller(a)[i]);
        }
    }
}
