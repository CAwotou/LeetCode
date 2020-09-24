import java.util.ArrayList;
import java.util.List;

public class BalanceBST {
    public List<Integer>sortedList=new ArrayList<>();
    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        sortedList.add(root.val);
        inOrder(root.right);
    }

    public TreeNode builder(int left,int right){
        if(left>right){
            return null;
        }
        int mid=(right-left)/2+left;
        TreeNode root=new TreeNode(sortedList.get(mid));
        root.left=builder(left,mid-1);
        root.right=builder(mid+1,right);
        return root;
    }
    public TreeNode balance(TreeNode root){
        inOrder(root);
        return builder(0,sortedList.size()-1);
    }
}
