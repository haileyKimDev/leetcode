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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        
        // step 1. find the middle of the list
        // slow will be the head of the 2nd half
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // step 2. reverse the 2nd half starting from slow.next
        ListNode l2 = reverse(slow.next);
        slow.next = null;  // cut the list to two halves
        
        // step 3. merge the two halves
        merge(head, l2);
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode n1 = l1.next, n2 = l2.next;
            l1.next = l2;
            
            if (n1 == null)
                break;
                
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }

}