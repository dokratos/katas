public class AlgoSolution {
    public ListNode reverseList(ListNode head) {
        // Dummy node that will help in reversing the list.
        ListNode dummy = new ListNode();

        // Pointer to traverse the original list.
        ListNode current = head;

        // Iterating through each node in the list.
        while (current != null) {
            // Temporary store the next node.
            ListNode nextTemp = current.next;

            // Reversing the link so that current.next points to the new head (dummy.next).
            current.next = dummy.next;

            // Move the dummy's next to the current node making it the new head of the reversed list.
            dummy.next = current;

            // Move to the next node in the original list.
            current = nextTemp;
        }

        // Return the reversed linked list which is pointed by dummy's next.
        return dummy.next;
    }
}

