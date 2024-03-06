/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
  const table = new Map();

  while (head !== null) {
      if (table.get(head) !== undefined) {
          return true;
      }

      table.set(head, 0);
      head = head.next;
  }

  return false;
};