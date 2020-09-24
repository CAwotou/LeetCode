public class IsSameTree {
    public boolean sameTree(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(q==null||p==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return sameTree(p.right,q.right)&&sameTree(p.left,q.left);
    }

    public static void main(String[] args) {

    }
}
