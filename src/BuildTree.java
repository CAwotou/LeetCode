import java.util.HashMap;
import java.util.Map;

public class BuildTree {

    int postIndex;
    int[] inorder;
    int[] postorder;
    Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

    public TreeNode build(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        postIndex = postorder.length - 1;
        int index = 0;
        for (int val : inorder) {
            indexMap.put(val, index++);
        }
        return helper(0, inorder.length - 1);
    }

    //inLeft,inRight当前子树的左右边界
    public TreeNode helper(int inLeft, int inRight) {
        if (inLeft > inRight) {
            return null;
        }
        int valOfRoot = postorder[postIndex];
        TreeNode root = new TreeNode(valOfRoot);
        int index = indexMap.get(valOfRoot);
        postIndex--;
        root.right = helper(index + 1, inRight);
        root.left = helper(inLeft, index - 1);
        return root;
    }

}
