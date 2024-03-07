/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var middleNode = function(head) {
  const arr = [];

  while (head !== null) {
      arr.push(head);
      head = head.next;
  }
  
  const index = Math.floor(arr.length/2);

  return arr[index];
};