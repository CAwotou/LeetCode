public class ConvertBST {
    int sum = 0;
    public TreeNode convert(TreeNode root) {
        if(root!=null){
            convert(root.right);
            sum=sum+root.val;
            root.val=sum;
            convert(root.left);
        }
        return root;
    }

}
