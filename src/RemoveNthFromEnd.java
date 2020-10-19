public class RemoveNthFromEnd {
    public ListNode remove(ListNode head,int n){
        ListNode dummy=new ListNode(0,head);
        int length=getLength(head);
        ListNode cur=dummy;
        for(int i=0;i<length-n+1;++i){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        ListNode ans=dummy.next;
        return ans;
    }
    public int getLength(ListNode head){
        int length=0;
        while (head!=null){
            ++length;
            head=head.next;
        }
        return length;
    }
}
