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
    public ListNode deleteMiddle(ListNode head) {
        // find the length
        int count = 0;
        ListNode pivot = head;
        while(pivot != null){
            count++;
            pivot = pivot.next;
        }
        int idxToRemove = count/2;
        if(idxToRemove == 0){
            head = null;
            return head;
        }
        ListNode curr = head;
        int idx = 0;
        while(idx != idxToRemove-1){
            curr = curr.next;
            idx++;
        }
        curr.next = curr.next.next;
        return head;
    }
}