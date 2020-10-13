public class GetMinimumDifference {
    int pre,ans;

    public int getMin(TreeNode root){
        ans=Integer.MAX_VALUE;
        pre=-1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre=root.val;
        dfs(root.right);
    }

}
