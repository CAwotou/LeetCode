/**
 * @author hjs
 */
public class AddTwoNumbers {
    public ListNode add(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1, q = l2, cur = head;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return head.next;
    }
}
