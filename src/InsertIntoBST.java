public class InsertIntoBST {
    public TreeNode insert(TreeNode root,int val){
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode cur=root;
        while(cur!=null){
            if(val<cur.val){
                if(cur.left==null){
                    cur.left=new TreeNode(val);
                    break;
                }
                else {
                    cur=cur.left;
                }
            }
            else{
                if(cur.right==null){
                    cur.right=new TreeNode(val);
                    break;
                }else {
                    cur=cur.right;
                }
            }
        }
        return root;
    }
}
