import java.util.LinkedList;
import java.util.List;

public class GenerateTrees {
    public List<TreeNode> trees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return trees(1, n);
    }

    public List<TreeNode> trees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if (start > end) {
            allTrees.add(null);
            return allTrees;
        }

        for (int i = start; i <= end; i++) {//枚举可行根节点
            List<TreeNode> leftTrees = trees(start, i - 1);//获得所有可行的左子树
            List<TreeNode> rightTrees = trees(i + 1, end);//获得所有可行右子树
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currTree = new TreeNode(i);//从左子树集合中选出一棵左子树，从右子树集合中选出一棵右子树，拼接到根节点上
                    currTree.left = left;
                    currTree.right = right;
                    allTrees.add(currTree);
                }
            }
        }
        return allTrees;
    }

    public void print(TreeNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        System.out.println(node.val);
        print(node.left);
        print(node.right);

    }

    public static void main(String[] args) {
        GenerateTrees test = new GenerateTrees();
        List<TreeNode> trees = new LinkedList<TreeNode>();
        trees = test.trees(5);
        for (int i = 0; i < trees.size(); i++) {
            test.print(trees.get(i));
            System.out.println("------");
        }
    }
}


