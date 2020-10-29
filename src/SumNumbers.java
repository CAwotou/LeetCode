/**
 * @author hjs
 */
public class SumNumbers {
    public int sum(TreeNode root){
        return dfs(root,0);

    }
    public int dfs(TreeNode root,int preSum){
        if(root==null){
            return 0;
        }
        int sum=preSum*10+root.val;
        if(root.left==null&&root.right==null){
            return sum;
        }
        else {
            return dfs(root.right,sum)+dfs(root.left,sum);
        }
    }
}
