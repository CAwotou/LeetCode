import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> paths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        generatePaths(root, "", paths);
        return paths;
    }

    public void generatePaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer sb = new StringBuffer(path);
            sb.append(Integer.toString(root.val));
            if (root.right == null && root.left == null) {
                paths.add(sb.toString());
            } else {
                sb.append("->");
                generatePaths(root.right, sb.toString(), paths);
                generatePaths(root.left, sb.toString(), paths);
            }
        }
    }
}
