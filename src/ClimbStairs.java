public class ClimbStairs {
    public int climb(int n) {
        int p=0 ,q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;


//        //递归
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        return climb(n-1)+climb(n-2);

    }

    public static void main(String[] args) {
        ClimbStairs test = new ClimbStairs();
        for (int i = 1; i < 100; i++) {
            System.out.println("i="+i+":"+test.climb(i));
        }

    }
}
