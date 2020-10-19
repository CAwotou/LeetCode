import java.util.Arrays;

public class SortedSquares {
    public int[] squares(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int []a={-4,-1,0,3,10};
        SortedSquares test=new SortedSquares();
        for(int i=0;i<a.length;i++){
            System.out.println(test.squares(a)[i]);
        }

    }
}
