/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode pre = null;
        ListNode current = head;
        ListNode after = head.next;
        while(after != null){
            current.next = pre;
            pre = current;
            current = after;
            after = after.next;
        }
        head = current;
        head.next = pre;
        return head;
    }
}
