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
    public ListNode addTwoNumbers(ListNode firstList, ListNode secondList) {
        // Create a dummy head for the result list
        ListNode result = new ListNode(0);
        // Pointer to traverse the result list
        ListNode current = result;
        
        // Variable to store the carry over
        int carry = 0;

        // Iterate while either list has remaining nodes
        while (firstList != null || secondList != null) {
            // Calculate the sum for the current digit, including the carry
            int sum = carry;

            // Add the value from the first list, if available, and move to the next node
            if (firstList != null) {
                sum += firstList.val;
                firstList = firstList.next;
            }

            // Add the value from the second list, if available, and move to the next node
            if (secondList != null) {
                sum += secondList.val;
                secondList = secondList.next;
            }

            // Calculate the new carry over
            carry = sum / 10;
            // Get the current digit (remainder)
            sum = sum % 10;

            // Add the current digit as a new node to the result list
            current.next = new ListNode(sum);
            // Move the pointer to the next node
            current = current.next;
        }

        // If there's a remaining carry after the final iteration, add it as a new node
        if (carry == 1) {
            current.next = new ListNode(1);
        }

        // Return the next node after the dummy head, which is the start of the actual result list
        return result.next;
    }
}
