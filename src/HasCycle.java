import java.util.HashSet;
import java.util.Set;

public class HasCycle {
    public boolean cycle(ListNode head) {
//        if (head == null || head.next == null) {
//            return false;
//        }
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while (slow!=fast){
//            if(fast==null||fast.next==null){
//                return false;
//            }
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return true;
        Set<ListNode> seen = new HashSet<>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode n4=new ListNode(4);
        ListNode n3=new ListNode(3,n4);
        ListNode n2=new ListNode(2,n3);
        ListNode n1=new ListNode(1,n2);
        n4.next=n2;
        HasCycle test=new HasCycle();
        System.out.println(test.cycle(n1));
    }
}

