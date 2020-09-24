import java.util.ArrayList;
import java.util.List;

public class FindMode {
    int base,count,maxCount;
    List<Integer> res=new ArrayList<>();

    public int[] find(TreeNode root){
        TreeNode cur=root,pre=null;
        while(cur!=null){
            if(cur.left==null){
                update(cur.val);
                cur=cur.right;
                continue;
            }
            pre=cur.left;
            while (pre.right!=null&&pre.right!=cur){
                pre=pre.right;
            }
            if(pre.right==null){
                pre.right=cur;
                cur=cur.left;
            }
            else {
                pre.right=null;
                update(cur.val);
                cur=cur.right;
            }
        }
        int mode[]=new int[res.size()];
        for(int i=0;i<res.size();++i){
            mode[i]=res.get(i);
        }
        return mode;
    }

    public void update(int x){
        if (x == base) {
            count=count+1;
        }
        else {
            count=1;
            base=x;
        }
        if(count==maxCount){
            res.add(base);
        }
        if(count>maxCount){
            maxCount=count;
            res.clear();
            res.add(base);
        }

    }

    /*
    List<Integer> mList = new ArrayList<>();
    int current = 0;//表示当前节点的值
    int count = 0;//表示当前节点的数量
    int maxCount = 0;//最大的重复数量

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);
        int[] res = new int[mList.size()];
        //把集合list转化为数组
        for (int i = 0; i < mList.size(); i++) {
            res[i] = mList.get(i);
        }
        return res;
    }

    //递归方式
    public void inOrderTraversal(TreeNode node) {
        //终止条件判断
        if (node == null)
            return;
        //遍历左子树
        inOrderTraversal(node.left);

        //下面是对当前节点的一些逻辑操作
        int nodeValue = node.val;
        if (nodeValue == current) {
            //如果节点值等于current，count就加1
            count++;
        } else {
            //否则，就表示遇到了一个新的值，current和count都要
            //重新赋值
            current = nodeValue;
            count = 1;
        }
        if (count == maxCount) {
            //如果count == maxCount，就把当前节点加入到集合中
            mList.add(nodeValue);
        } else if (count > maxCount) {
            //否则，当前节点的值重复量是最多的，直接把list清空，然后
            //把当前节点的值加入到集合中
            mList.clear();
            mList.add(nodeValue);
            maxCount = count;
        }

        //遍历右子树
        inOrderTraversal(node.right);
    }
    */
}
