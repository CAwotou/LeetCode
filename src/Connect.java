import java.util.LinkedList;
import java.util.Queue;

public class Connect {
    public Node connectNode(Node root){
        if(root==null){
            return null;
        }
        Queue<Node>queue=new LinkedList<Node>();
        queue.offer(root);

        while (!queue.isEmpty()){
            Node pre=null;
            int levelCount= queue.size();
            for(int i=0;i<levelCount;i++){
                Node node=queue.poll();
                //如果pre为空就表示node节点是这一行的第一个(根节点），没有前一个节点指向他，否则就让前一个节点指向他
                if(pre!=null){
                    pre.next=node;
                }
                //然后再让当前节点成为前一个节点
                pre=node;
                if(node.left!=null){
                    queue.offer(node.left);
                }

                if(node.right!=null){
                    queue.offer(node.right);
                }

            }
        }
        return root;
    }
}
