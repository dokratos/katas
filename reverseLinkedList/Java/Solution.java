import java.util.ArrayDeque;


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode reversed = new ListNode(0);
        ListNode dummy = reversed;
        ArrayDeque<ListNode> reorder = new ArrayDeque<>();

        while (head != null) {
            reorder.addFirst(head);
            head = head.next;
        }

        while (!reorder.isEmpty()) {
            dummy.next = reorder.poll();
            dummy = dummy.next;
            System.out.println(dummy.val);
        }

        return reversed.next;
    }
}
