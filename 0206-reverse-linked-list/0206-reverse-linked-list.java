/**
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * O(n) runtime, O(1) space
 *
 * this question can be solved by using an iteration method or a recursion method
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// iteration
public class Solution {
public ListNode reverseList(ListNode node)
    {
        ListNode prev = null;
        ListNode current = node;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}

