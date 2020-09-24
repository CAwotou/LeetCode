public class MySqrt {
    public int sqrt(int x) {
        int left = 0;
        int right = x;
        int ans = -1;
        while (right >=left) {
            int mid = (right + left) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left=mid+1;
            }
            if(mid*mid>x){
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MySqrt test = new MySqrt();
        System.out.println(test.sqrt(101));
    }
}
