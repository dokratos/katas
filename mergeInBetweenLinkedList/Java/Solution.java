
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode merged = dummyHead;
        int count = 0;

        while (list1 != null && count < a) {
            merged.next = list1;
            list1 = list1.next;
            merged = merged.next;
            count++;
        }

        while (list1 != null && count <= b) {
            list1 = list1.next;
            count++;
        }

        while (list2 != null) {
            merged.next = list2;
            list2 = list2.next;
            merged = merged.next;
        }

        while (list1 != null) {
            merged.next = list1;
            list1 = list1.next;
            merged = merged.next;
        }

        return dummyHead.next;
    }
}
