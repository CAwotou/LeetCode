import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
    public List<Integer>postOrder(TreeNode root){
        List<Integer>res=new ArrayList<Integer>();
        post(root,res);
        return res;
    }
    public void post(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        post(root.left,res);
        post(root.right,res);
        res.add(root.val);

    }
}
