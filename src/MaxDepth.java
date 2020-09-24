public class MaxDepth {
    public int depth(TreeNode root){
        if(root==null){
            return 0;
        }
        else {
            int left_height = depth(root.left);
            int right_height=depth(root.right);
            return Math.max(right_height,left_height)+1;
        }
    }
}
