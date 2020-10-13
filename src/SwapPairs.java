public class SwapPairs {
    public ListNode swap(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=head.next;
        head.next=swap(head.next);
        newHead.next=head;
        return newHead;
    }
}
