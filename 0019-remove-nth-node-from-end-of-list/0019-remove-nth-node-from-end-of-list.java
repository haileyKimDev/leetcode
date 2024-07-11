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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode left = head;
        ListNode right = head;

        for(int i = 0 ; i < n; i++){
            right = right.next; 
        }

        if (right == null) {
            return head.next; //포인터이동  포인터(참조)의 변경
        }

        while(right.next !=null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;

        return head;
    }
}