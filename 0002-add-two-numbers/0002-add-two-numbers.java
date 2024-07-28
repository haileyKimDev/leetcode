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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode currentNode = dummyHead;

        int carry = 0;  // Set default carry

        while (l1 != null || l2 != null) {

            int sum = carry;  // Initialize sum with carry

            if (l1 != null) {  // Use number from first list
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {  // Use number from second list
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;  // Calculate carry
            sum = sum % 10;  // Calculate remaining sum

            currentNode.next = new ListNode(sum);
            currentNode = currentNode.next;
        }

        if (carry != 0) {
            currentNode.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

}