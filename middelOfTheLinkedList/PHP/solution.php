/**
* Definition for a singly-linked list.
* class ListNode {
* public $val = 0;
* public $next = null;
* function __construct($val = 0, $next = null) {
* $this->val = $val;
* $this->next = $next;
* }
* }
*/
class Solution {

/**
* @param ListNode $head
* @return ListNode
*/
function middleNode($head) {
$array = array();

while (!is_null($head)) {
array_push($array, $head);
$head = $head->next;
}

return $array[intdiv(count($array),2)];
}
}