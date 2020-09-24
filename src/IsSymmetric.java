public class IsSymmetric {
    public boolean symmetric(TreeNode root){
        return check(root,root);
    }
    public boolean check(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return check(p.left,q.right)&&check(p.right,q.left)&&p.val==q.val;
    }
}
