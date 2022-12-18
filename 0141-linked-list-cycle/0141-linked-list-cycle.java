/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
        public boolean hasCycle(ListNode head) {
            Set<ListNode> set = new HashSet();
            while (head != null) { //while head is not null
                if (!set.add(head)) { //if set doens't contain head, that means set.add() returns true                                          //if set didn't contain head element
                    return true;
                }
                head = head.next; //link next 
            }
            return false; // when head is null
        }
    }
